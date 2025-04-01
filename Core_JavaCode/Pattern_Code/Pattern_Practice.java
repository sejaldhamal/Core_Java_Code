public class Pattern_Practice
{
  public static void main(String x[])
  {
     int i,j;

     for(i=1;i<=5;i++)
	 {   int c=65;
		 for(j=1;j<=9;j++)
		 {
			 
			 if(j>=6-i&&j<=4+i)
			 {
				 if(j<5)
				 {
				   System.out.printf("%c",c++);
				 }
				 else
				 {
					 System.out.printf("%c",c--);
				 }
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
 
/*

                         A 
		      A B A
		    A B C B A
		  A B C D C B A
		A B C D E D C B A
		*/