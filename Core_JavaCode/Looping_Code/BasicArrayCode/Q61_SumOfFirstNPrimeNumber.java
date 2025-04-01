/*
61. Sum of First N Prime Number
Description: Write a program to calculate the sum of the first n prime numbers.
Input: n = 4
Output: 28
*/
package BasicArrayCode;

public class Q61_SumOfFirstNPrimeNumber {

	public static void main(String[] args) {
		int limit=4;
		int count=0;
		int sum=0;
		int no=2;
		while(count!=limit)
		{   
		    int i=2;
		    boolean isPrime=true;
			while(i<=no/2)
			{		
				if(no%i==0)
					{
						isPrime=false;
					}
				
			    i++;
			}
		if(no>1&&isPrime)
				{
					sum=sum+no;
					count++;

				}
		no++;
		}

	    
		System.out.println(sum);
	}
}
