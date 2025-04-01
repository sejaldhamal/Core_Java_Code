
/*31. Sum of Cubes of First N Natural Numbers
Description: Write a program to calculate the sum of cubes of the first n natural numbers.
Input: n = 3
Output: 36
*/



package BasicArrayCode;
import java.util.*;
public class Q31SumOfCubeOfFirstNnumber {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the limit number:");
		int no=xyz.nextInt();
		int sum=0;
		for(int i=1 ; i<=no ; i++)
		{
			sum=sum+(i*i*i);
		}
		System.out.println(sum);
	}

}
