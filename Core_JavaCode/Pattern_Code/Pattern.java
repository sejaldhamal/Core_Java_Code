public class PatternTest
{
  public static void main(String x[])
  {
	    
		int i,j;
		for(i=0 i<10 ; i++)
		{
			for(j=0 ; j<9 ; j++)
		    {
				if(j=10-i && j%2==0)
				{
					System.out.println("#");
				}
				else{
					System.out.printf("%d",i);
				}
			}
		System.out.println();
		}
   }
}   