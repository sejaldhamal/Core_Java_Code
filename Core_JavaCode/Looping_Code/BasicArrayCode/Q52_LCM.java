/*52. Find Least Common Multiple (LCM)
Description: Write a program to find the least common multiple (LCM) of two numbers.
Input: a = 12, b = 15
Output: 60
*/
package BasicArrayCode;

public class Q52_LCM {

	public static void main(String[] args) {
		int a=12,b=15,max;	
	    if(a>b)
	    {
	    	max=a;
	    }
	    else {
	    	max=b;
	    }
	    int lcm=0;
	    while(max>0)
	    {
	    	if(max%a==0 && max%b==0)
	    	{
	    		 lcm=max;
	    		break;
	    	}
	    	max++;
	    	 
	    }
	    System.out.println(max);	

	}

}
