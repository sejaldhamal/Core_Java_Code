/*54. Check for Perfect Cube
Description: Write a program to check if a number is a perfect cube.
Input: n = 27
Output: Perfect Cube
*/

package BasicArrayCode;

public class Q54_PerfectCube {

	public static void main(String[] args) {
		int i=27;
			
	     int cube=i;
	      for(int j=1 ; j<=20 ; j++)
	      {
	    	  if(cube==j)
	    	  {
	    		  System.out.println("Perfect Cube");  
	    	  }
	    	  else {
	    		  System.out.println(" Not Perfect Cube");
	    	  }
	      }
			
		}
	}


