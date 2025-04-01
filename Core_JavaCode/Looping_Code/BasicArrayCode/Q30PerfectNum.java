
/*30. Perfect Number
Description: Write a program to check if a number is perfect.
Input: n = 6


Output: Perfect
*/



package BasicArrayCode;
import java.util.*;
public class Q30PerfectNum {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=xyz.nextInt();
	int sum=0;
	
    for(int i=1 ; i<=no/2 ; i++)
    {
    	if(no%i==0)
    	{
    		sum=sum+i;
    	}
    }
    
    if(no==sum)
    {
    	System.out.println("Perfect Number");
    }
    else {
    	System.out.println(" Not Perfect Number");
    }
	}

}
