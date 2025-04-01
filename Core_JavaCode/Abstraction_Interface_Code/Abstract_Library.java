/*5. Library Abstract Class
Problem: Create an abstract class Library that contains:
addBook(Book book) — adds a book to the library.
removeBook(String title) — removes a book based on the title.
Then, create two subclasses:
PublicLibrary — allows only public books to be added (books available to all).
PrivateLibrary — allows only private books to be added (books available to specific users).
Write a program that adds and removes books from both types of libraries and shows the current library list.
Explanation:
The abstract class Library contains the basic operations for adding and removing books.
Subclasses implement additional restrictions on the type of books that can be added.
Logical operation: Use abstraction to define the behavior of libraries, and the subclasses handle specific implementation details.*/


import java.util.ArrayList;
import java.util.List;


abstract class Library {
    protected List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Abstract methods for adding and removing books
    public abstract void addBook(Book book);
    public abstract void removeBook(String title);

    // Method to display current library list
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Current books in the library:");
        for (Book book : books) {
            System.out.println(" - " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}


class Book {
    private String title;
    private String author;
    private String category; // "public" or "private"

    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }
}


class PublicLibrary extends Library {
   
    public void addBook(Book book) {
        if ("public".equalsIgnoreCase(book.getCategory())) {
            books.add(book);
            System.out.println("Added public book: " + book.getTitle());
        } else {
            System.out.println("Cannot add book: " + book.getTitle() + ". Only public books can be added.");
        }
    }

   
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        System.out.println("Removed book: " + title);
    }
}


class PrivateLibrary extends Library {
  
    public void addBook(Book book) {
        if ("private".equalsIgnoreCase(book.getCategory())) {
            books.add(book);
            System.out.println("Added private book: " + book.getTitle());
        } else {
            System.out.println("Cannot add book: " + book.getTitle() + ". Only private books can be added.");
        }
    }

   
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        System.out.println("Removed book: " + title);
    }
}


public class Abstract_Library {
    public static void main(String[] args) {
       
        Library publicLibrary = new PublicLibrary();
        Library privateLibrary = new PrivateLibrary();

       
        Book publicBook1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "public");
        Book publicBook2 = new Book("1984", "George Orwell", "public");
        Book privateBook1 = new Book("Secret Diary", "Anonymous", "private");
        Book privateBook2 = new Book("Private Memoirs", "Confidential", "private");

       
        publicLibrary.addBook(publicBook1);
        publicLibrary.addBook(publicBook2);
        publicLibrary.addBook(privateBook1); // Will not be added
        privateLibrary.addBook(privateBook1);
        privateLibrary.addBook(privateBook2);
        privateLibrary.addBook(publicBook1); // Will not be added

      
        System.out.println("\nPublic Library");
        publicLibrary.displayBooks();

        System.out.println("\nPrivate Library");
        privateLibrary.displayBooks();

       
        publicLibrary.removeBook("1984");

        System.out.println("\nAfter removing a book from Public Library:");
        publicLibrary.displayBooks();
    }
}
 




