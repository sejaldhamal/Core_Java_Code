public class wrapper_ArrayPrimitiveResult_wrapperIntegerObject 
{
    public static void main(String x[]) 
	{
        int a[] = {1, 2, 3, 4};

        // Convert int array to Integer array
        Integer b[] = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.valueOf(a[i]);
        }

        // Print the Integer array
		System.out.println("Wrapper class array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}

