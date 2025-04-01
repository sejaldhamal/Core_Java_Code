class Employee
{
private String name;
private int id;
private int sal;
private String address;
private String quali;

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

public void setSal(int s)
{
sal=s;
}
public int getSal()
{
return sal;
}


public void setAddress(String a)
{
address=a;
}
public String getAddress()
{
return address;
}

public void setQuali(String q)
{
quali=q;
}
public String getQuali()
{
return quali;
}
}

class Company
{
Employee emp;
void addNewEmployee(Employee e)
{
emp=e;
}
void showEmployee()
{
System.out.println("Name is " +emp.getName());
System.out.println("Id is " +emp.getId());
System.out.println("Salary is " +emp.getSal());
System.out.println("Address is " +emp.getAddress());
System.out.println("Qualification is " +emp.getQuali());
}
}  

public class PojoCompany
{
public static void main(String x[])
{
Employee e1=new Employee();
Company c1=new Company();

e1.setId(1);
e1.setName("RAM");
e1.setSal(28000);
e1.setAddress("PUNE");
e1.setQuali("BE");

c1.addNewEmployee(e1);
c1.showEmployee();
 }
}













