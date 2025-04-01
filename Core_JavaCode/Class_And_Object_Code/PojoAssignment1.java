class Admission
{
private int id;
private String name;
private int totalfees;
private int paidfees;

public void setId(int i)
{
id=i;
}
public int getId()
{
return id;
} 


public void setName(String n)
{
name=n;
}
public String getName()
n{
return name;
}


 public void setTotalfees(int t)
{
totalfees=t;
}
public int getTotalfees()
{
return totalfees;
} 


public void setPaidFees(int p)
{
paidfees=p;
}
public int getPaidFees()
{
return paidfees;
} 
}


class College
{
Admission ad;
void addNewStudent(Admission q)
{
ad=q;
}
void showAdmission()
{
System.out.println(ad.getId()+"\t"+ad.getName()+"\t"+ad.getTotalfees()+"\t"+ad.getPaidFees());

}
}

  

public class PojoAssignment1
{
 public static void main(String x[])
{
College c1= new College();
Admission a=new Admission();

a.setId(101);
a.setName("Sneha");
a.setTotalfees(40000);
a.setPaidFees(30000);

c1.addNewStudent(a);
c1.showAdmission();
}
}


