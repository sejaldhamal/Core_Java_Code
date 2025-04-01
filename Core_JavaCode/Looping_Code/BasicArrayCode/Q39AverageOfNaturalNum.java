
/*39. Calculate Average of First N Natural Numbers
Description: Write a program to calculate the average of the first n natural numbers.
Input: n = 5


Output: 3.0
*/


package BasicArrayCode;
import java.util.*;
public class Q39AverageOfNaturalNum {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int n=5;
		int Sum=0;
		for(int i=1 ; i<=n ; i++)
		{
			Sum=Sum+i;
			
		}
		int Avg=Sum/n;
       System.out.println(Avg);
	}

}
