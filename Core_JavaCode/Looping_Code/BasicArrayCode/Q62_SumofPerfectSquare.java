/*62. Sum of First N Perfect Squares
Description: Write a program to calculate the sum of the first n perfect squares.
Input: n = 4
Output: 30
*/
package BasicArrayCode;

public class Q62_SumofPerfectSquare {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1 ; i<=20 ; i++)
		{
			
	      int sqr=i*i;
	      for(int j=1 ; j<=20 ; j++)
	      {
	    	  if(sqr==j)
	    	  {
	    		 sum=sum+j; 
	    	  }
	      }
			
		}
		System.out.println(sum);
	}

}
