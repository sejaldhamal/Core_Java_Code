
/*38. Count the Number of Prime Numbers in a Range
Description: Write a program to count the number of prime numbers between m and n.
Input: m = 1, n = 10
Output: 4
*/


package BasicArrayCode;

public class PrimeInRange {

	public static void main(String[] args) {
	int m=1,n=10;
	while(m<=n)
	{    boolean flag=true;
		for(int j=2 ; j<=m/2 ; j++)
		{  
			if(m%j==0)
			{
				flag=false;
			}
		}
		
	
	if(flag && m>1)
	{
		System.out.println(m);
	}
m++;
	}
}
}
