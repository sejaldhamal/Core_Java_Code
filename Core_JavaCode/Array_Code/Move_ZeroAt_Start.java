import java.util.*;
public class Move_ZeroAt_Start
{
   public static void main(String x[])
   {
      Scanner xyz=new Scanner(System.in);
	
	int a[]=new int[5];
	System.out.println("Enter the Array Elements");
	
	for(int i=0; i<a.length-1 ; i++)
	{
		a[i]=xyz.nextInt();
	}
    
	int end=a.length-1;
	for(int i=a.length-1 ; i>=
	0 ; i--)
	{
		 if(a[i]!=0)
		 {
			 a[end]=a[i];
			 end--;
		 }
	}
	
	while(end>=0)
	{
		a[end]=0;
		end--;
	}
	
    

   
   for(int i = 0; i < a.length; i++)
   {
        System.out.print(a[i] + " ");
    }
  }
}  
  