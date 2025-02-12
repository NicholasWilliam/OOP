import java.util.ArrayList;

class Author {
    String name;
    String biography;

    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }
}

class Book {
    String title;
    String isbn;
    Author author;

    public Book(String title, String isbn, Author author) {
        this.title = title; 
        this.isbn = isbn;
        this.author = author;
    }
}

class Borrower {
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

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("James Gosling", "Creator of the Java programming language.");
        Author author2 = new Author("Robert C. Martin", "Known for his works on software craftsmanship.");

        Book book1 = new Book("Java Programming", "123456789", author1);
        Book book2 = new Book("Clean Code", "987654321", author2);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        Borrower borrower = new Borrower("Alice");

        library.borrowBook(borrower, book1);
        library.borrowBook(borrower, book2);

        borrower.displayBorrowedBooks();

        library.returnBook(borrower, book1);

        borrower.displayBorrowedBooks();

        library.displayLibraryBooks();
    }
}
