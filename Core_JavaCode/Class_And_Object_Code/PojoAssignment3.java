class Admission
{
private int id;
private String name;
private int age;


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
{
return name;
}





public void setAge(int a)
{
Age=a;
}
public String getAge()
{
return age;
}

}


class Voter
{
Voter ad;
void addNewVoter(Admission v)
{
ad=v;
}
void showVoter()
{
System.out.println(ad.getId()+"\t"+ad.getName()+"\t"+ad.getAge());

}
}

  

public class PojoAssignment3
{
 public static void main(String x[])
{
Votermachine v1= new Votermachine();
Voter a=new Voter();

a.setId(101);
a.setName("Sneha");
a.setAge(22);

v1.addNewVoter(a);
v1.showVoter();
}
}


