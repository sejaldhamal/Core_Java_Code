/*Q6. WAP to implement the startsWith() method manually?*/


import java.util.*;
public class startsWithMethodManually
{
	public static void main(String x[])
	{
		
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string for input: ");  //morning
		String str=xyz.nextLine();
		System.out.println("Enter string for check in last:"); //mor
		String eStr=xyz.nextLine();
		
		boolean flag=false;
		for(int i=0;i<eStr.length();i++)
		{
			if(str.charAt(i)==eStr.charAt(i)){
				flag=true;
			}
			else{
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("String is start with: "+eStr);
		}
		else{
			System.out.println("String is not starts with: "+eStr);
		}
	}
}
/*

Enter string for input:
morning
Enter string for check in last:
mor
String is start with: mor
*/
