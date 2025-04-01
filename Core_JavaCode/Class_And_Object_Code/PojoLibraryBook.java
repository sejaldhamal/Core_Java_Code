class Book
{
private String name;
private int id;
private String author;


public void setName(String n)
{
name=n;
}
public String getName()
{
return name;
}


public void setId(int i)
{
id=i;
}
public int getId()
{
return id;
}


public void setAuthor(String a)
{
author=a;
}
public String getAuthor()
{
return author;
}
}

class Library
{
Book book;
void addNewBook(Book b)
{
book=b;
}
void showBook()
{
System.out.println("Name is " +book.getName());
System.out.println("Id is " +book.getId());
System.out.println("Company is " +book.getAuthor());

}
}  

public class PojoLibraryBook
{
public static void main(String x[])
{
Library l=new Library();
Book b1=new Book();

b1.setId(1);
b1.setName("RAM");
b1.setAuthor("PUNE");


l.addNewBook(b1);
l.showBook();
 }
}








