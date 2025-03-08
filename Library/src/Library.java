import java.util.ArrayList;

class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library: " + book.title);
    }

    public void borrowBook(Borrower borrower, Book book) {
        if (books.contains(book)) {
            books.remove(book);
            borrower.borrowBook(book);
        }
    }

    public void returnBook(Borrower borrower, Book book) {
        borrower.returnBook(book);
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println("Title: " + book.title);
            System.out.println("ISBN: " + book.isbn);
            System.out.println("Author: " + book.author.name);
            System.out.println("Biography: " + book.author.biography);
            System.out.println("------------------------");
        }
    }
}
