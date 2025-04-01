/*Que 30:Print a diamond shape using stars with 7 rows.

        *
       ***
      *****
     *******
      *****
       ***
        *
*/

public class Diamond_Pattern_Revision
{
   public static void main(String x[])
   {
     for(int i=1 ; i<=7 ; i++)
	 {
	     for(int j=1 ; j<=7 ; j++)
		 {
		         if((j>=5-i && j<=3+i)&&(j>=i-3 && j<=11-i))
		         {
		            System.out.printf("*");
				 }
				
			    else{
			        System.out.printf(" ");
			        }
		 }
		
		System.out.println();
		}
		
	}
}