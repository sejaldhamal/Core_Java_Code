/*Q4. Finding Common Elements Between Two Lists
 Description: Given two HashSet objects (representing skills of two employees),
 find and print the skills that are common to both.*/

import java.util.*;
class Employee
{
	private String name;
	private String skill; 
	
	public Employee(String name,String skill)
	{
		this.name=name;
		this.skill=skill;
	}
	public String getName() 
	{
        	return name;
    	}

    	public String getSkill() 
	{
        	return skill;
    	}

        public void setName(String name) 
	{
        	this.name = name;
    	}

    	public void setSkill(String skill) 
	{
        	this.skill = skill;
    	}

}
public class Hashset_CommonElements_Btwn_TwoListsEmployees
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size For First Employee set");
        	int size = sc.nextInt();
        	sc.nextLine();

        	HashSet<Employee> hs = new HashSet<Employee>();
        	for (int i = 0; i < size; i++) 
		{
            		System.out.println("Enter " + (i + 1) + " Employee Details");
           		System.out.println("Enter Employee Name");
           		String name = sc.nextLine();
            		System.out.println("Enter Employee Skills");
            		String skill = sc.nextLine();
            		Employee e1 = new Employee(name, skill);
            		hs.add(e1);
        	}

        	System.out.println("Enter Size For Second Employee set");
        	int size1 = sc.nextInt();
       		sc.nextLine();

        	HashSet<Employee> hs1 = new HashSet<Employee>();

       		 for (int i = 0; i < size1; i++) 
		{
            		System.out.println("Enter " + (i + 1) + " Employee Details");
           		System.out.println("Enter Employee Name");
           		String name = sc.nextLine();
            		System.out.println("Enter Employee Skills");
            		String skill = sc.nextLine();
            		Employee e2 = new Employee(name, skill);
            		hs1.add(e2);
        	}       }      }

