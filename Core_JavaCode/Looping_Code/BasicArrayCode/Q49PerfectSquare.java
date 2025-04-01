/*49. Perfect Square Numbers
Description: Write a program to find perfect square numbers up to n.
Input: n = 20
Output: 1 4 9 16
*/
package BasicArrayCode;

public class Q49PerfectSquare {

	public static void main(String[] args) {
		for(int i=1 ; i<=20 ; i++)
		{
			
	      int sqr=i*i;
	      for(int j=1 ; j<=20 ; j++)
	      {
	    	  if(sqr==j)
	    	  {
	    		  System.out.println(" "+j);  
	    	  }
	      }
			
		}
	}

}
