import java.util.*;
public class Vector_Mearge
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("\n Display element in Vector:");
		for(int i=0;i<5;i++)
		{
			int no = sc.nextInt();
			v.add(no);
		}

		System.out.println("Vector First Data:");
		for (int i = 0; i < v.size(); i++) 
		{
            		System.out.print(v.get(i)+"\t");
        	}

		Vector v1=new Vector();
		System.out.println("\n Display element in Vector:");

		for(int i=0;i<5;i++)
		{
			int no = sc.nextInt();
			v1.add(no);
		}

		System.out.println("\nVector Second Data:");
		for (int i = 0; i < v.size(); i++) 
		{
            		System.out.print(v1.get(i)+"\t");
        	}
		
		for (int i = 0; i < v1.size(); i++) 
		{
            		v.add(v1.get(i));
        	}

        	System.out.println("\nMerged Vector:");
        	for (int i = 0; i < v.size(); i++) 
		{
            		System.out.print(v.get(i) + "\t");
        	}
   	}
}