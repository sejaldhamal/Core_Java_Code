/*Q5.Remove Duplicate Characters from a String
Input: "programming"
Output: "progamin"
*/

import java.util.*;
public class RemoveDuplicateCharacters 
{
    public static void main(String x[]) 
	{
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = xyz.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++) 
		{
            char ch = s.charAt(i);
            // Check if the character is already in the result
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) 
			{
                if (result.charAt(j) == ch) 
				{
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result += ch; // Add the character if it's not already present
            }
        }
        System.out.println("String after removing Duplicates: " + result);
    }
}
