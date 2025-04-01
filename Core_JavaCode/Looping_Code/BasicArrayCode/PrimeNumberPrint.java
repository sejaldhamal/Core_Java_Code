/*4. Prime Numbers
Description: Write a program to print all prime numbers up to a given number n.
Input: n = 10
Output: 2 3 5 7 
*/
package BasicArrayCode;
import java.util.*;
public class PrimeNumberPrint {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=xyz.nextInt();
	
	for(int i=1;i<=n;i++) {
		boolean isPrime=true;
		
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				isPrime=false; 
				break;
			}
		}
		if(i>1&&isPrime) {
			System.out.print(i+" ");
		}
	}
}
}