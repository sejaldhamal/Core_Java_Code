

interface Employee
{
	public void performTask();
	public void calculateSalary();
}
class Manager implements Employee
{   
	String name;
	double baseSalary;
	int teamSize;
	Manager(String name,double baseSalary,int teamSize)
	{
		this.name=name;
		this.baseSalary=baseSalary;
		this.teamSize=teamSize;
	}
	public void performTask()
	{
		System.out.println("Manager is managing a team");
	}
	public void calculateSalary()
	{
		System.out.println("Salary="+(baseSalary+(teamSize*1000)));
	}
}
class Developer implements Employee
{
	String name;
	double baseSalary;
	int completedTasks;
	Developer(String name,double baseSalary,int completedTasks)
	{
		this.name=name;
		this.baseSalary=baseSalary;
		this.completedTasks=completedTasks;
	}
	public void performTask()
	{
		System.out.println("Developer is coding");
	}
	public void calculateSalary()
	{
		System.out.println("Salary="+(baseSalary+(completedTasks*200)));
	}
}
  public class Interface_Employeesalary
 {
	public static void main(String x[])
	{
		Manager m=new Manager("Ram",20000,10);
		m.performTask();
		m.calculateSalary();
		
		Developer d=new Developer("shyam",10000,20);
		d.performTask();
		d.calculateSalary();
	}
}