import java.util.*;
public class Vector_UniqueValue
{

	public static void main(String args[])
	{
		Vector v = new Vector(5);
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Display element in Vector:");


		for(int i=0;i<5;i++)
		{
			int no = sc.nextInt();
			v.add(no);
		}
		System.out.println("\n Unique element in Vector:");

 
		for (int i = 0; i < v.size(); i++) 
		{
            		boolean flag = true;
            		for (int j = i+1; j < v.size(); j++) 
			{
                		if ((int)v.get(i)!=(int)(v.get(j))) 
				{
                    			flag = false;
                    			break;
                		}
            		}
           		 if (flag) 
			{
                		System.out.println(v.get(i) + "\t");
            		}
        	}
        }
}