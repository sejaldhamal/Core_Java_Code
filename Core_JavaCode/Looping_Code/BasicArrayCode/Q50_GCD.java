/*50. Find Greatest Common Divisor (GCD)
Description: Write a program to find the greatest common divisor (GCD) of two numbers.
Input: a = 12, b = 15
Output: 3
*/

package BasicArrayCode;

public class Q50_GCD {

	public static void main(String[] args) {
	int a=12,b=15,min;	
    if(a>b)
    {
    	min=b;
    }
    else {
    	min=a;
    }
    int gcd=0;
    while(min>0)
    {
    	if(a%min==0 && b%min==0)
    	{
    		 gcd=min;
    		break;
    	}
    	min--;
    	 
    }
    System.out.println(gcd);
	}

}
