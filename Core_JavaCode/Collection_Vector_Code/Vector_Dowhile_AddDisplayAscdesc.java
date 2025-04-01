import java.util.*;
public class Vector_Dowhile_AddDisplayAscdesc 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        do
        {
            System.out.println("1. Add 10 Values In Vector.");
            System.out.println("2. Display All Values In Vector.");
	    System.out.println("3. Add New Value In Vector.");
	    System.out.println("4. Search Value In Vector.");
            System.out.println("5. Sort All Values In Ascending Order In Vector.");
	    System.out.println("6. Sort All Values In Descending Order In Vector.");
	    System.out.println("7. Find Max Value In Vector.");
            System.out.println("8. Find Min Value In Vector.");
	    System.out.println("9. Update Value In Vector.");
	    System.out.println("10.Delete Value In Vector.");
	    System.out.println("11:Exit");
            System.out.println("Enter Your Choice:");
            int ch = sc.nextInt();
            switch (ch) 
	    {
                case 1:
		    System.out.println("Enter Size:");
		    int size=sc.nextInt();
                    for (int i = 0; i < size; i++) 
		    {
			int no=sc.nextInt();
			v.add(no);
		    }
                    break;
                case 2:
			Iterator itr = v.iterator();
			while(itr.hasNext()) 
			{
				Object obj=itr.next();
				System.out.println(obj+"\t");
			}

                    break;
		case 3:
		  for (int j = 0; j < 3; j++) 
		    {
			int no=sc.nextInt();
			v.add(no);
		    }
		    System.out.println("Value Added Successfully");

			
			break;
		 case 4:
			/*System.out.println("Enter value for search");
			int value=sc.nextInt();
			int index=v.indexOf(value);
			if(index!=-1) 
			{
				System.out.println("Value available");
			}
			else 
			{
				System.out.println("Value Not Found");
			}*/
			/*System.out.println("Enter value for search");
			int Searchvalue=sc.nextInt();
			boolean b=v.contains(Searchvalue);
			if(b) 
			{
				System.out.println("Value available");
			}
			else 
			{
				System.out.println("Value Not Found");
			}*/
			System.out.print("Enter value for search : ");
			int value=sc.nextInt();
			int index=v.indexOf(value);
			if(index!=-1) 
			{
				System.out.println("Value Found...");
			}
			else
			 {
				System.out.println("Value Not Found...");
			 }

                    break;
		case 5:
			
			for(int i=0;i<v.size();i++)
			{
				for(int j=i+1;j<v.size();j++)
				{
					if((int)v.get(i)>(int)v.get(j))
					{
						int temp = (int)v.get(i);
							//v[i]=v[j];
							v.set(i,v.get(j));
							v.set(j,temp);
					}
				}
			}

			System.out.println("\nVector After sorting in ascending Order");
			 itr = v.iterator();
			while(itr.hasNext()) 
			{
				Object obj=itr.next();
				System.out.println(obj);
			}

			break;
		 case 6:
			for(int i=0;i<v.size();i++)
			{
				for(int j=i+1;j<v.size();j++)
				{
					if((int)v.get(i)<(int)v.get(j))
					{
						int temp = (int)v.get(i);
							//v[i]=v[j];
							v.set(i,v.get(j));
							v.set(j,temp);
					}
				}
			}

			System.out.println("\nVector After sorting in Descending Order");
			 itr = v.iterator();
			while(itr.hasNext()) 
			{
				Object obj=itr.next();
				System.out.println(obj);
			}

                    break;
		case 7:
			int max=0;
		        itr = v.iterator();
			while(itr.hasNext()) 
			{
				Object obj=itr.next();
				if((int)obj>max)
				{
					max=(int)obj;
				}
			}
			System.out.println("Maximum Value For Vector:"+max);

			break;
		 case 8:
			int min=(int)v.get(0);
			itr = v.iterator();
			while(itr.hasNext()) 
			{
				Object obj=itr.next();
				if((int)obj<min)
				{
					min=(int)obj;
				}
			}
			System.out.println("Manimum Value For Vector:"+min);
                    break;
		case 9:
			System.out.println("Enter Index");
			int index1=sc.nextInt();
			System.out.println("Enter Update Value");
			int updatevalue=sc.nextInt();
			v.set(index1,updatevalue);
			System.out.println("Value Upadated Successfully");
			break;
		 case 10:
			/*System.out.println("Enter Deleted Value:");
			int delete=sc.nextInt();
			itr = v.iterator();
			while(itr.hasNext()) 
			{
				Object obj=itr.next();
				if((int)obj!=delete)
				{
					System.out.println(obj+"\t");
 
				}
			}
			System.out.println("Data Deleted Succssfuly...");*/
			System.out.println("Enter Deleted Value:");
			int delete=sc.nextInt();
			for(int i=0;i<v.size();i++)
			{
				if(delete==(int)v.get(i))
				{
					v.remove(i);
					i--;
				}
			}
			System.out.println("Data Deleted Succssfuly...");
			break;
		
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        } while (true);
    }
}
