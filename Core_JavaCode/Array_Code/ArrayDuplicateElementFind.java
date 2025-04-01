/* Find Duplicates in an Array
-  Write a class to create a method to identify and display duplicate elements in an integer array.
*/


import java.util.*;
class DuplicateElementArray
{
  int a[];
  void setArray(int a[])
  {
   this.a=a;
  }

   void FindDuplicates()
   {
      boolean flag=false;
     System.out.println("Duplicate Elements in Array are: ");
     for(int i=0 ; i<a.length ; i++)
     {
       for(int j=i+1 ; j<a.length ; j++)   
        {
          if(a[i]==a[j])
           {
               System.out.println(a[i]);
               flag=true;
               break;    
     
              }
          }
       }

  if(!flag)
  {
    System.out.println("No Duplicate Found");
  }
}

}
public class ArrayDuplicateElementFind
{
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);

 DuplicateElementArray d1=new DuplicateElementArray();
 int a[]=new int[5];
 System.out.println("Enter Elements in Array : ");
     for(int i=0 ; i<a.length ; i++)
     {
       a[i]=xyz.nextInt();
     }
    d1.setArray(a);
    d1.FindDuplicates();
 }
}

  
