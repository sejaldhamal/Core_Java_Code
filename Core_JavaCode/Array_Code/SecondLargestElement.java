/* Find Second Highest Element in Array*/



import java.util.*;
 public class SecondLargestElement
 {
    public static void main(String x[])
    {
     int a[],i,j;
      a=new int[5];                  
      Scanner xyz=new Scanner(System.in);

      System.out.printf("Enter the Array: ");
      for(i=0 ; i<a.length ;i++)
      {
          a[i]=xyz.nextInt();
        }

    int max=0;        
    int sh=0;          

   for(i=0 ; i<a.length ;i++)                           
   {
      if(max<a[i])                                       
      {                                               
       
        max=a[i];                                      
      }
   }
    for(i=0 ; i<a.length ;i++)                           
   {
      if(a[i]<max && sh<a[i]) 
	  {
         sh=a[i];
		  }
       }
    System.out.println("Second Largest Element in array is: "+sh);
   }
  }