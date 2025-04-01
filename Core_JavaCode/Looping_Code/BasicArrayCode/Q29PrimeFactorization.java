/*29. Prime Factorization
Description: Write a program to perform prime factorization of a number n.
Input: n = 12
Output: 2 2 3
*/
package BasicArrayCode;
import java.util.*;
public class Q29PrimeFactorization {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.print("Enter a number for prime factorization: ");
        int n = xyz.nextInt(); 

        System.out.print("Prime factors of " + n + " are: ");

        int count=0;
        for (int i = 2; i <= n; i++) {
			
            if(n % i == 0) { 
             
				boolean flag=true;
               for(int j=2 ;j<=i/2 ; j++)
			   {    
				   if(i%j==0)
				   {
					  
					   flag=false;
				   }
			   }
              
			   if(flag)
			   {
				   System.out.println(i);
				   count++;
			   }
			  
			   
            }
            
        }
        System.out.println("count is: "+count);  
}

}

