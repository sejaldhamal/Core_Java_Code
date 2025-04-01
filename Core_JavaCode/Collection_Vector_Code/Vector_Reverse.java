import java.util.*;
public class Vector_Reverse 
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
		 System.out.println("Vector before Revers:");
		Iterator itr = v.iterator();
		while (itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.print(obj + "\t");
		}
		int mid=v.size()/2;
     		int len=v.size()-1;
                for (int i = 0; i < v.size() / 2; i++)
		 {
                        Object temp = v.get(i);
                        v.set(i, v.get(len));
                        v.set(len, temp);
                        len--;
                }

		System.out.println("\nVector After Revers");
		itr = v.iterator();
		while (itr.hasNext())
	        {
			Object obj = itr.next();
			System.out.print(obj + "\t");
		}

	}
}
	
