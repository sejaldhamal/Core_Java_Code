

public class NegativeValueAtEnd
{
   public static void main(String[] args) {
    int[] a = {1, 2, 0, 4, 3, 0, 5, 0};
    int negativeIndex = 0;

    for (int i = 0; i < a.length; i++) {
        if (a[i] >=0) {
            int temp = a[negativeIndex];
            a[negativeIndex] = a[i];
            a[i] = temp;
            negativeIndex++;
        }
    }

   /* for (int num : a)*/
   for(int i = 0; i < a.length; i++)
   {
        System.out.print(a[i] + " ");
    }
  }
}  
  