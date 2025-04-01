import java.util.*;
class Student
{
  String name,grade;
  int age;
  Student(String name,String grade,int age)
  {
	 this.name=name;
     this.grade=grade;
     this.age=age;	 
  }
}

class StudentApp
{
	Student st[];
	public void setStudent(Student st[])
	{
	 this.st=st;
	}
	 
   public void sortStudent()
   {
	  System.out.println("Before Sorting");
	  for(int i=0;i<st.length;i++)
	  {
		 System.out.println("Name of Student: "+st[i].name+"\t Grade: "+st[i].grade+"\tAge: "+st[i].age); 
	  }
	  
	  System.out.println("After Sorting");
	  for(int i=0;i<st.length;i++)
	  {
		  for(int j=i+1;j<st.length;j++)
	       {
		    if(st[i].age>st[j].age)
		    {  
		       Student temp=st[i];
			   st[i]=st[j];
			   st[j]=temp;
		    }
		   }
	  }
	  
	  for(int i=0;i<st.length;i++)
	  {
		 System.out.println("Name of Student: "+st[i].name+"\t Grade: "+st[i].grade+"\tAge: "+st[i].age); 
	  }
   }
  
}
public class D_CustomClassSortingRecord
{
 public static void main(String x[])
 {
  Scanner s=new Scanner(System.in);
  StudentApp s1=new StudentApp();
  Student st[]=new Student[3];// array of reference
   for(int i=0;i<st.length;i++)
   {
	 System.out.println("Enter the Name");
     String n=s.nextLine();
      
	 System.out.println("Enter the Grade");
     String g=s.nextLine(); 
	 
	 System.out.println("Enter the Age");
     int age=s.nextInt(); 
	 s.nextLine();
	 st[i]=new Student(n,g,age);
   }
   s1.setStudent(st);
   s1.sortStudent();
	   
 } 
}