import java.util.*;

public class Vector_Occurrence 
{
    public static void main(String x[]) 
    {
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(3);

        System.out.println("Display Vector:");
        Iterator itr = v.iterator();
        while (itr.hasNext()) 
	{
            Object obj = itr.next();
            System.out.print(obj + "\t");
        }

        System.out.println("\nOccurrence of every element in Vector:");
        for (int i = 0; i < v.size(); i++)
        {
            int count = 0;
            for (int j = 0; j < v.size(); j++)
            {
                if (v.get(i).equals(v.get(j)))
                {
                    count++;
                }
            }
            System.out.println(v.get(i) + "---->" + count);
        }
    }
}
