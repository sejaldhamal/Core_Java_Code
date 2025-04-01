
import java.util.*;
class Student
{
 int a[],per,sum;
 void SubMarks(int a[])
 {
 this.a=a;
 }

 void calculatePer()
 { sum=0;
   for(int i=0 ; i<a.length ; i++)
   {
    sum=sum+a[i];
    
   }
 per=sum/6;
System.out.println("Percentage of Students are:"+per);
}
 
  void checkGrades()
  {
    if(per>75 && per<=100)
    {
       System.out.printf("Student in Distinction");
     }
   
   else if(per>60 && per<=75)
    {
       System.out.printf("Student in First Division");
     }
   
   else if(per>=50 && per<=60)
    {
       System.out.printf("Student in Second Division");
     }


    else if(per>40 && per<=50)
    {
       System.out.printf("Student in Third Division");
     }
   
    else
    {
       System.out.printf("Student is Failed");
     }
   }
}

public class ClassObject_Que4_ArrayStudentMarks
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);

int a[]=new int[6];
System.out.println("Enter the Student Marks: ");
for(int i=0 ; i<a.length ; i++)
{
  a[i]=xyz.nextInt();
}

Student s1=new Student();
s1.SubMarks(a);
s1.calculatePer();
s1.checkGrades();
 }
}






