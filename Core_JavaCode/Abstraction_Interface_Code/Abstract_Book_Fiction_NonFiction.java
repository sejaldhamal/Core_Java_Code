/*4. Book Abstract Class
Problem: Create an abstract class Book with the following fields:
title (String)
author (String)
Add an abstract method displayDetails() that shows the book's title and author.
Then, create two subclasses:
FictionBook — displays additional details like genre.
NonFictionBook — displays additional details like the subject.
Write a program that creates instances of both subclasses and displays their details.
Explanation:
The abstract class Book provides common properties like title and author.
Each subclass extends the functionality by adding more details specific to the type of book.
Logical operation: Use inheritance to extend functionality and overriding to display specific details for each book type.*/



abstract class Book {
    protected String title;
    protected String author;

   
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

   
    public abstract void displayDetails();
}


class FictionBook extends Book {
    private String genre;

   
    public FictionBook(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }


  
    public void displayDetails() {
        System.out.println("Fiction Book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}


class NonFictionBook extends Book {
    private String subject;

  
    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

   
   
    public void displayDetails() {
        System.out.println("Non-Fiction Book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}


public class Abstract_Book_Fiction_NonFiction{
    public static void main(String x[]) 
{
        Book fictionBook = new FictionBook("Technical", "Ram", "Maths");
        Book nonFictionBook = new NonFictionBook("Phisician", "Shyam", "Physics");

        fictionBook.displayDetails();
        System.out.println(); 
        nonFictionBook.displayDetails();
    }
}