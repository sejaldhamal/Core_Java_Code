import java.util.*;
public class ArrayDuplicate
{
   public static void main(String x[])
   {
      int a[],i,j,temp,c=1;
      a=new int[5];
      Scanner xyz=new Scanner(System.in);

     System.out.printf("Enter the Array: ");
     for(i=0 ; i<a.length ;i++)
     {
        a[i]=xyz.nextInt();
       }


      for(i=0 ; i<a.length ; i++)
      {
         for(j=i+1 ; j<a.length ; j++)
         {
		   if(a[i]==a[j])
		   {
		     System.out.println(a[i]);
			 }
			 
		    }
		}
	}
}