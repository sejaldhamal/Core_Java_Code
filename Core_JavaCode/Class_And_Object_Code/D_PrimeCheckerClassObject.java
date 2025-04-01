import java.util.*;
class Prime
{
  
  Prime(int n)
  {  int c=0;
      for(int i=2;i<=n/2;i++)
	  {
	       if(n%i==0)
		   {
		    c++;
			break;
		   }
	  }
	  if(c==0&&c!=1)
	  {
	   System.out.println("Number is Prime");
	  }
	  else
	  {
	   System.out.println("Number is not Prime");
	  }

  }
}
public class D_PrimeCheckerClassObject
{
 public static void main(String x[])
 {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number");
   int no=s.nextInt();
   Prime p=new Prime(no);
 }
}