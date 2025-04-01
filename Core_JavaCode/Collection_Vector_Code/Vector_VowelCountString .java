import java.util.*;

public class Vector_VowelCountString 
{
    public static void main(String x[]) 
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector(5);
	System.out.println("Enter A 5 string:");
	for(int i=0;i<5;i++)
	{
        String str = sc.nextLine();
        v.add(str);
	}
        int count = 0;
        for (int i = 0; i < str.length(); i++)
	 {
            char ch = str.charAt(i);
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
            {
                count++;
            }
        }
        System.out.println("vowel=" + count);
    }
}