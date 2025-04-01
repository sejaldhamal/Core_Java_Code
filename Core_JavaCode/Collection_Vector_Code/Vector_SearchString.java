import java.util.*;

public class Vector_SearchString 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();

        System.out.println("\nDisplay String in Vector:");
        for (int i = 0; i < 5; i++) 
	{
            System.out.println("Enter string " + (i + 1));
            String str = sc.nextLine();
            v.add(str);
        }

        System.out.println("\nStrings in Vector:");
        for (int i = 0; i < v.size(); i++) 
	{
            System.out.println(v.get(i));
        }

        boolean flag = false;
        for (int i = 0; i < v.size(); i++)
        {
            String str = (String) v.get(i);
            if (str.length() > 3 && str.endsWith("sh"))
	    {
                System.out.println("String found: " + str);
                flag = true;
            }
        }

        if (!flag) 
	{
            System.out.println("No string found with length more than 3 and ending with 'sh'");
        }
    }
}