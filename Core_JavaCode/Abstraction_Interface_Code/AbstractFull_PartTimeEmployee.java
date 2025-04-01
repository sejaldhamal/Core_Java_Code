/*2. Employee Abstract Class
Problem: Create an abstract class Employee with the following fields:
id (int)
name (String)
salary (double)
Add an abstract method calculateBonus() to compute the bonus for the employee based on the salary.
Then, create two subclasses:
FullTimeEmployee — calculates a 20% bonus.
PartTimeEmployee — calculates a 10% bonus.
Write a program that calculates and displays the bonus for both types of employees.
Explanation:
The abstract class Employee provides common properties and an abstract method for bonus calculation.
Each subclass has its own bonus logic.
Logical operation: Polymorphism is demonstrated by calculating the bonus differently based on the type of employee.*/

import java.util.*;

abstract class Employee
 {
    protected int id;
    protected String name;
    protected double salary;

   
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
     abstract double calculateBonus();

   
   void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}


class FullTimeEmployee extends Employee {
    
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

   
    public double calculateBonus() {
        return salary * 20/100;
    }
}


class PartTimeEmployee extends Employee {
  
    public PartTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

 
    public double calculateBonus() {
        return salary * 10/100;
    }
}


public class AbstractFull_PartTimeEmployee {
    public static void main(String[] args) {
      
        Employee fullTimeEmployee = new FullTimeEmployee(1, "ram", 50000);
        fullTimeEmployee.display(); 

        System.out.println(); 

      
        Employee partTimeEmployee = new PartTimeEmployee(2, "shyam", 30000);
        partTimeEmployee.display(); 
    }
}