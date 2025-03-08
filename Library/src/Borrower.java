import java.util.ArrayList;

public class Borrower {
        String name;
    ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed: " + book.title);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " returned: " + book.title);
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println("Title: " + book.title);
            System.out.println("ISBN: " + book.isbn);
            System.out.println("Author: " + book.author.name);
            System.out.println("Biography: " + book.author.biography);
            System.out.println("------------------------");
        }
    }
}
