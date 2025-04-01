/*Q4. WAP to convert new string with existing string without using replace function?
*/

import java.util.*;
public class ReplaceFunctionNotUse
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Input String From keyboard:"); //good morning india
		String str=xyz.nextLine();
		System.out.println("Enter Existing String: ");  //mor
		String eStr=xyz.nextLine();
		System.out.println("Enter New String for Insert: ");  //eve
		String nStr=xyz.nextLine();
		
		int index=str.indexOf(eStr);   //calculate index of eStr(existing string) in input string (str)  i,e. 6
		if(index!=-1)
              {                                                                //if index is exists then 
String prePor = str.substring(0,index);   //previous portion   str.substring(0,6) ==> "good "
			System.out.println(prePor);  
			
String nextPor = str.substring((index+eStr.length()),str.length()); //next portion of string str.substring((6+3),18)==>(9,18)==>"ning india"
			System.out.println(nextPor); 
			
			str = prePor+nStr+nextPor;          //str="good "+"eve"+"ning india" 
			
			System.out.println("New String after replace is:"+str);  //good evening india
		}
		else{  //if index is -1 not exists string 
			System.out.println("String not existing for replace:"+str);
		}
	}
}
/*

Enter Input String From keyboard:
Good morning India
Enter Existing String:
mor
Enter New String for Insert:
eve
Good
ning India
New String after replace is:Good evening India
*/
