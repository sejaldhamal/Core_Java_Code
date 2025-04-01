/*Question1 : Student Grade List Using LinkedList
 Description: Use a LinkedList to store student names and their grades. Implement methods to
 add a student’s grade, display all students and their grades, and remove students who failed (grade below 50).*/

import java.util.*;
class Student
{
	private String name;
	private int grades;
	public Student()
	{
	}
	public Student(String name,int grades)
	{
		this.name=name;
		this.grades=grades;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getGrades() 
	{
		return grades;
	}
	public void setGrades(int grades) 
	{
		this.grades = grades;
	}
	public String toString() 
	{
        	return  name + "\t" + grades;
    	}	
}
public class LinkedList_StudentGrade
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> ls=new LinkedList<Student>();
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			sc.nextLine();
			System.out.println("Enter Students Name and Grade:");
			String name=sc.nextLine();
			int grade=sc.nextInt();
			Student s1=new Student(name,grade);
			ls.add(s1);
		}
		System.out.println("Display All Students and Their Grades:");
		for(Student stud:ls)
		{
			System.out.println(stud);
		}
		
		Iterator itr = ls.iterator();
       		while (itr.hasNext()) 
		{
   			 Object obj = itr.next();
   			 Student stud = (Student) obj; 
   			 if (stud.getGrades() < 50) 
			 { 
        			itr.remove();
   			 }
		}
                     System.out.println("Above 50 Marks  Students and Their Grades:");
		for(Student stud:ls)
		{  
                              System.out.println(stud);
               }      }      }
