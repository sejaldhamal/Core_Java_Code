/*Q7. WAP to implement the split() method manually?*/



import java.util.*;
public class StringSplitManually 
{
    public static void main(String[] args) 
	{
        Scanner xyz = new Scanner(System.in);

        // Sample input string
        String str = "sakshi@gmail.com,karan@gmail.com,reva@gmail.com";

        // Variables to hold the current substring
        String nStr = "";
        for (int i = 0; i < str.length(); i++) {
            // Check for delimiters (comma or space)
            if (str.charAt(i) == ',' || str.charAt(i) == ' ') {
                System.out.println(nStr); // Print the current substring
                nStr = ""; // Reset for the next substring
            } else {
                nStr += str.charAt(i); // Append the character to the current substring
            }
        }

        // Print the last substring if there is no trailing delimiter
        if (!nStr.isEmpty()) {
            System.out.println(nStr);
        }
    }
}
/*

C:\Program Files\Java\jdk1.8.0_202\bin>java Jan12_2025StringSplitManually
sejali@gmail.com
sejal@gmail.com
sejal@gmail.com
*/
