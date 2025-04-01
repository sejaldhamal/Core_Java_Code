/*
                1
		2 # 2
		3 # 3 # 3
		4 # 4 # 4 # 4
		5 # 5 # 5 # 5 # 5
		5 # 5 # 5 # 5 # 5
		4 # 4 # 4 # 4
		3 # 3 # 3
		2 # 2
		1

*/

public class Pattern2Practice
{
   public static void main(String x[])
    {
		int i,j;
		
		
		for(i=1;i<=10;i++)
		{   boolean flag=true;
			for(j=1;j<=9;j++)
			{
				if(i<=5&&(j>=6-i&&j<=4+i)&&flag)
				{
					
				     
					   System.out.printf("%d",i);
					   flag=false;
				}
				  else if(i>=6&&(j>=i-5&&j<=15-i)&&flag)
				 {
					System.out.printf("%d",11-i);
					flag=false;
				 }
				else if(!flag &&j>=6-i&&j<=4+i&&j>=i-5&&j<=15-i)
				{
					System.out.printf("#");
					flag=true;
				}
					
				else
			   {
				   System.out.printf("");
				   
			    }
			}
				
			
			System.out.println();
		}
	}
}