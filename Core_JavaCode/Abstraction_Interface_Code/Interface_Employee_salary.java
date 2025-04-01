
import java.util.*;
interface Employee       //interface
{
	
	public void calculateSalary(); //abstract method
}
class Manager implements Employee    //implementer class of interface Employee
{   int id;
	String name;
	double baseSalary;
	
	Manager(int id,String name,double baseSalary)   //constructor 
	{   this.id=id;
		this.name=name;
		this.baseSalary=baseSalary;
		
	}
	
	public void calculateSalary()  //method of calculatesalary
	{
		System.out.println("Salary of Manager="+baseSalary);
		System.out.println("Bonus="+(baseSalary+(baseSalary*0.2)));
	}
}
class Developer implements Employee     //implementer class of interface Employee
{    int id;
	String name;
	double baseSalary;
	
	Developer(int id,String name,double baseSalary)   //constructor
	{   this.id=id;
		this.name=name;
		this.baseSalary=baseSalary;
		
	}
	
	public void calculateSalary()
	{
		System.out.println("Salary of Devloper="+baseSalary);
			System.out.println("Bonus="+(baseSalary+(baseSalary*0.1)));
	}
}
  public class Interface_Employee_salary    //main class 
 {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
	   Manager m=new Manager(1,"Shyam",20000);  //object of manager class
		
		/*System.out.println("Enter the id,name,basesalary of Maneger:");
	    id=xyz.nextInt();
		String name=xyz.nextLine();
		double baseSalary=xyz.nextDouble();*/
		 
		m.calculateSalary();    //call method
		   
		Developer d=new Developer(2,"ram",30000);      //object of Developer class
		/*System.out.println("Enter the id,name,basesalary of Developer:");
		int id=xyz.nextInt();
		String name=xyz.nextLine();
		double baseSalary=xyz.nextDouble();*/
		
		d.calculateSalary();  //call method
	}
}