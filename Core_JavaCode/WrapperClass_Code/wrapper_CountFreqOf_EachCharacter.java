public class wrapper_CountFreqOf_EachCharacter 
{
    public static void main(String x[]) 
	{
        String s = "java";
        int[] freq = new int[256]; // Array to store frequency of characters (ASCII values)

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) 
		{
            char ch = s.charAt(i); // Get each character
            freq[ch]++; // Increment frequency based on ASCII value
        }
        // Display the frequency of characters
     

   System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) 
		{
			// Only print characters with non-zero frequency
            if (freq[i] > 0) 
			{ 
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}
