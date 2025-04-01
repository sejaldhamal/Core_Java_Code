
/*1. Sum of Numbers
Description: Write a program to calculate the sum of numbers from 1 to n.
Input: n = 5


Output: 15
*/


package BasicArrayCode;
import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
	    System.out.println("Enter the limit: ");
	    int n=xyz.nextInt();
	    int sum=0;
	    
	    for(int i=1 ; i<=n ; i++)
	    {
	    	sum=sum+i;
	    }
       System.out.println("Sum is: "+sum); 
	}

}
