/*Q1. Sorting an ArrayList
Create an ArrayList of custom objects and sort them using Collections.sort() based on a specific field.
Example: you have to create Employee class with field id,name and salary and sort employee data by using salary.*/

import java.util.*;
class Employee implements Comparable
{
	private int id;
	private String name;
	private int salary;
	public Employee()
	{
	} 
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	} 

	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
        {
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	public int compareTo(Object o)
	{
		Employee e1=(Employee)o;
		if(this.salary >e1.getSalary())
		{
			return 1;
		}
		else if(this.salary <e1.getSalary())
		{
			return -1;
		}
		else
		{
			return 0;
		}

		
	}
}
public class ArrayList_Employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("Enter Size:");
        	int size = sc.nextInt();

        	for (int i = 0; i < size; i++) 	
		{
            		 
            		System.out.println("Enter Id,Name and Salary:");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int salary=sc.nextInt();
           		/*e.setId(id);
                        e.setName(name);
            		e.setSalary(salary);*/
			Employee e = new Employee(id,name,salary);
			al.add(e);
	
             	}

		System.out.println("Display Employee records without sorting");
	   	for(Object obj:al) 
		{
		   Employee e=(Employee)obj;
		   System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
	   	}
		Collections.sort(al);
		System.out.println("Display Employee records with Salary Wise sorting");
	   	for(Object obj:al) 
		{
		   Employee e=(Employee)obj;
		   System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
	   	}

	}
}

