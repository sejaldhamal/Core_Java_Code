import java.util.*;
class Employee
{
 String name;
 int id,basicSal,progress,incSal,totalSal;
 void setPersonalInfo(String name,int id,int basicSal)
 {
   this.name=name;
   this.id=id;
   this.basicSal=basicSal;
 }

 void setProgressPer(int progress)
 {
   this.progress=progress;
   if(progress>60)
   {
      incSal=basicSal*30/100;
     
 totalSal=(basicSal+incSal);
     
    }
 }

 void show()
 {
   System.out.println("name:"+name);
   System.out.println("id:"+id);
   System.out.println("Basic Salary:"+basicSal);
   System.out.println("Incremental Salary:"+incSal);
   System.out.println("Total Salary:"+totalSal);
  }
}
public class ClassObject_Que3_EmployeeInfo
{
 public static void main(String x[])
 {
   Scanner xyz = new Scanner(System.in);
  
  System.out.println("Enter the Name of Employee:");
  String name=xyz.nextLine(); 

  System.out.println("Enter the Id of Employee:");
  int id=xyz.nextInt(); 

  System.out.println("Enter the progress value of Employee:");
  int progress=xyz.nextInt(); 

  System.out.println("Enter the basic Salary of Employee:");
  int basicSal=xyz.nextInt(); 

 Employee e1= new Employee();
 e1.setPersonalInfo(name,id,basicSal);

 e1.setProgressPer(progress);
 e1.show();

}
}













