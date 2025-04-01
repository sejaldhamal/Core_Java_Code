
/*6. Armstrong Number
Description: Write a program to check if a number is an Armstrong number.
Input: n = 153
Output: Armstrong*/

package BasicArrayCode;
import java.util.*;
public class Q6ArmstrongNum {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int no=xyz.nextInt();
	int temp=no;
	int count=0;
	while(no>0)
	{
		int rem=no%10;
		count++;
		no=no/10;
	}
	System.out.println(count);
	no=temp;
	int sum=0;
	
	while(no>0)
	{
		int rem=no%10;
		no=no/10;
		int p=1;
		for(int i=1 ; i<=count ; i++)
		{
			 p=p*rem;
		}
		sum=sum+p;
	}
	if(temp==sum)
	{
		System.out.println("Armstrong");
	}
	else {
		System.out.println(" not Armstrong");
	}
	
	
	
	
	}

}
