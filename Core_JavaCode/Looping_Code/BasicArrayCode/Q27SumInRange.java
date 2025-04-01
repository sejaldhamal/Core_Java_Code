
/*27. Sum of All Numbers in a Range
Description: Write a program to calculate the sum of all numbers between m and n.
Input: m = 1, n = 5


Output: 15
*/

package BasicArrayCode;
import java.util.*;
public class Q27SumInRange {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the starting number:");
	int m=xyz.nextInt();
	System.out.println("Enter the limit number:");
	int n=xyz.nextInt();
     int sum=0;
	 for(int i=m ; i<=n ; i++)
	 {
		sum=sum+i; 
	 }
	 System.out.println(sum);
	}

}
