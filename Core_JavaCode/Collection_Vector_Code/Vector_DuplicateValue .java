import java.util.*;

public class Vector_DuplicateValue 
{
    public static void main(String x[]) 
    {
	Scanner sc=new Scanner(System.in);
        Vector v = new Vector();
        System.out.println("\n Add element in Vector:");
		for(int i=0;i<5;i++)
		{
			int no = sc.nextInt();
			v.add(no);
		}

		System.out.println("Display Vector  Data:");
		for (int i = 0; i < v.size(); i++) 
		{
            		System.out.print(v.get(i)+"\t");
        	}

        System.out.println("\nDuplicate Vector:");
        for (int i = 0; i < v.size(); i++)
        {
            
            for (int j = i+1; j < v.size(); j++)
            {
                if (v.get(i).equals(v.get(j)))
                {
                    System.out.println(v.get(i)+"\t"); 
                }
            }
       }
    }
}
