class Student
{
private int id;
private String name;
private float per;
private int totalFees;
private int disFees;
int actualpaidfees;

public void setid(int i)
{
id=i;
}
public int getid()
{
return id;
} 



public void setname(string n)
{
name=n;
}
public String getname()
{
return name;
}


 
public void setPer(float p)
{
Per=p;
}
public float getPer()
{
return Per;
}


public void settotalfees(int t)
{
totalfees=t;
}
public int gettotalfees()
{
return totalfees;
} 

public void setdisfees(int dis)
{
disfees=dis;
}
public int getdisfees()
{
return disfees;
} 
 

public void setactualPaidFees(int a)
{
actualPaidFees=a;
}
public int getactualPaidFees()
{
return actualPaidFees;
} 
 

class Studetail
{
Student s;
{
void setStudent(Student s

)
{
stud ss;
}
void showStudent()
{
System.out.println(Student.getid()+"\t" Student.getname()+"\t" Student.getPer()+"\t" Student.gettotalfees()+"\t"
 Student.getdisfees()+"\t" Student.getactualPaidfees
()+"\t");
}
}

  

public class DiscountFees
{
 public static void main(String x[])
{
Student as= new Student();
Student st=new Student();

st.Studetail();
st.showdetails();
}
}


