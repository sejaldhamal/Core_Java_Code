/*Q5. WAP to implement the endsWith() method manually?
*/


import java.util.*;
public class endsWithMethodManually
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string for input: ");  //morning
		String str=xyz.nextLine();
		System.out.println("Enter string for check in last:"); //ing
		String eStr=xyz.nextLine();
		
		boolean flag=false;
		                 
                                          //String comp=str.substring((str.length()-eStr.length()),str.length());
		                  //System.out.println(comp); ==> ing
		


                       int index=str.length()-eStr.length();
		for(int i=index,j=0;i<str.length();i++,j++)
		{
			if(str.charAt(i)==eStr.charAt(j)){
				flag=true;
			}
			else{
				flag=false;
				break;
			}
		} 
		if(flag){
			System.out.println("The string is endsWith: "+eStr);
		}
		else{
			System.out.println("The string is not endsWith: "+eStr);
		}
	}
}
/*

Enter string for input:
morning
Enter string for check in last:
ing
The string is endsWith: ing
*/