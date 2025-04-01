/*Q4.Convert a Sentence to Title Case ?
Input: "java is fun"
Output: "Java Is Fun"
*/
import java.util.*;
public class ConvertTitleCase 
{
    public static void main(String x[]) 
	{
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = xyz.nextLine();

        String result = ""; // Initialize the result string
        boolean capitalizeNext = true; // Flag to indicate if the next character should be       capitalized

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result += ch; // Add space to the result
                capitalizeNext = true; // Set the flag to capitalize the next character
            } 
			else if (capitalizeNext) {
                // Capitalize the character if the flag is true
                result += Character.toUpperCase(ch);
                capitalizeNext = false; // Reset the flag
            } 
			else {
                // Add the character in lowercase
                result += Character.toLowerCase(ch);
            }
        }

        System.out.println("Converted to Title Case: " + result);
    }
}
