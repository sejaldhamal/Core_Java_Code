
import java.util.*;
public class Test_ProductArrayExceptCurrent
{
	public static void main(String x[])   //main method
	{
		Scanner m=new Scanner(System.in);
		
		int a[]=new int[5];  //initialize the array
		
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)  //input the array elements
		{
			a[i]=m.nextInt();
		}
		
		
		
		int b[]=new int[5];  //take another array with same size
		
		for(int i=0;i<a.length;i++)
		{	
	       b[i]=1;                        //declare b[i]=1
			
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)        //compute the product of all elements except the current one
				{                     //10 3 5 6 2
					b[i]=b[i]*a[j];  //1*3=3  // 3*5=15 // 15*6=90 // 90*2=180
				}
			}
		}
		
		
		
		     for(int i=0 ; i<b.length ; i++)
		     {
				System.out.printf("%d ",b[i]);
	          }
        }
}
	

