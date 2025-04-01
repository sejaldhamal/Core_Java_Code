
/*Q1. WAP to calculate the length of a string without using the length() method?*/
import java.util.*;
public class CountLetterFromString {
	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
   System.out.println("Enter the String: ");
   String str=xyz.nextLine();
 
   str=str+"#";
   int i=0;
   while(str.charAt(i)!='#')
   {
   	 i++;
   }
   System.out.println("Word count in string is: "+i);
  
	}
}
