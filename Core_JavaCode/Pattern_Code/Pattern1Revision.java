public class Pattern1Revision
{
  public static void main(String x[])
  {
     int i,j;
	 boolean flag=true;

     for(i=1;i<=6;i++)
	 {   
		 for(j=1;j<=11;j++)
		 {
			 if(j>=7-i && j<=6+i && flag)
			 {
				 System.out.printf("%d",i);
				 flag=false;
			 }
			 else{
				 System.out.printf(" ");
				 flag=true;
			 }
		 }
		 System.out.println();
	 }
  }
}
/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6	    */		 
			 
			 