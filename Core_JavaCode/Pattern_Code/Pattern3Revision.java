public class Pattern3Revision
{
  public static void main(String x[])
  {
     int i,j;

     for(i=1;i<=6;i++)
	 {   
		 for(j=1;j<=i;j++)
		 {
		   int sum=i+j;
		   if(sum%2==0)
		   {
             System.out.print(1 +"");
		   }
        else{
              System.out.print(0 +"");			
		   
		  }
		
     }
	 System.out.println();
	 }
  }
}
     /*
	 1
     01
     101
     0101
     10101
     010101   */