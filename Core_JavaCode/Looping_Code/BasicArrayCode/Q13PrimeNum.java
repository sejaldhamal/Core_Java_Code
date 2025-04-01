
/*13. Check for Prime Number
Description: Write a program to check if a number n is prime.
Input: n = 7
Output: Prime*/
package BasicArrayCode;
import java.util.*;
public class Q13PrimeNum {
   public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the number:");
	int no=xyz.nextInt();
    int count=0;
	int i=1;
	while(i<=no)
	{
	  if(no%i==0)
	  {
		  count++;
	  }
	i++;	
	}
	if(count==2)
	{
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
	}

}
