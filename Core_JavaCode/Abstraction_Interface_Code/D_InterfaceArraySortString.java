
import java.util.*; 
interface Sorted
{
  void Sort(int a[]);
  void Sort(char ch[]);

}
	
class IntegerArray implements Sorted
  {
	 int a[]; 
    public void Sort(int a[])
	{
		this.a=a;
	}
    public void Sort(char ch[])
	 {
		 
	 }
 	
	  void show()
	  {
		for(int i=0;i<a.length;i++)
		{
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]>a[j])
			  {
				int temp=a[i];
                                 a[i]=a[j];
                                 a[j]=temp;				
			  }
		  }			  
		}
		System.out.println("After sorting Int Array\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d", a[i]);
		}
	}	
  }	
  
class StringArray implements Sorted
  {
	  char b[];
	public void Sort(char b[])
	  {
		 this.b=b; 
	  }
	 public void Sort(int a[])
	 {
		 
	 }

    void show()
	{	
		for(int i=0;i<b.length;i++)
		{
		  for(int j=i+1;j<b.length;j++)
		  {
			  if(b[i]>b[j])
			  {
				char temp=b[i];
                                b[i]=b[j];
                                b[j]=temp;				
			  }
		  }			  
		}
		System.out.println("\nAfter sorting String Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%c ",b[i]);
		}
	  }	
  }	

public class D_InterfaceArraySortString
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		IntegerArray s1=new IntegerArray();

		StringArray s2=new StringArray();

		System.out.println("Enter the interger Elements");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
		 a[i]=s.nextInt();	
		}
		s1.Sort(a);
		s1.show();
		System.out.println("\nEnter the String Elements");
		char b[]=new char[4];
		for(int i=0;i<b.length;i++)
		{
		 b[i]=s.next().charAt(0);	
		}
		s2.Sort(b);
		s2.show();

	}
}