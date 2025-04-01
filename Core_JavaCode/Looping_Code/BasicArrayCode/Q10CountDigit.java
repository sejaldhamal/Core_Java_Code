
/*10. Count Digits
Description: Write a program to count the number of digits in a number n.
Input: n = 12345


Output: 5*/



package BasicArrayCode;
import java.util.*;
public class Q10CountDigit {
public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number: ");
		int no=xyz.nextInt();
int count=0;
	while(no>0)
	{
		count++;
		no=no/10;
	}
	System.out.println(count);
	}

}
