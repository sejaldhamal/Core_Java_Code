/*Q1.Find the First Non-Repeated Character  ?
  Input: "swiss"
  Output: 'w'
*/

import java.util.*;
public class FirstNonRepeatedChar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=xyz.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}
			if(count==1){
				System.out.println("First Non-Repeated Character is: 
                                               "+s.charAt(i));
				break;
			}	
		}	
	}
}
