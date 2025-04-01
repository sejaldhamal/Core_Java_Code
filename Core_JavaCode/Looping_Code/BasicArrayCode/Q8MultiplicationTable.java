
/*8. Multiplication Table
Description: Write a program to print the multiplication table for a number n.
Input: n = 4


Output: 4 8 12 16 20  */




package BasicArrayCode;
import java.util.*;
public class Q8MultiplicationTable {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number: ");
		int no=xyz.nextInt();
        for(int i=1 ; i<=10 ; i++)
        {
        	int table=no*i;
        	System.out.print(" "+table);
        }
	}

}
