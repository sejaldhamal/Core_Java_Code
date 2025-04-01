import java.util.*;
class Seller
{
int sp,cp;
void acceptSellingCostPrice(int sp,int cp)
{
 this.sp=sp;
 this.cp=cp;
}

void showProfitLoss()
{
 if(sp>cp)
 {
  System.out.printf("Profit");
 }
 else
  {
   System.out.printf("Loss");
  }
 }
}

public class ClassObject_Que9_SellingCostPrice
{
 public static void main(String x[])
  {
  Scanner xyz= new Scanner(System.in);

 System.out.printf("Enter the Selling Price: ");
 int sp=xyz.nextInt();

 System.out.printf("Enter the Cost Price: ");
 int cp=xyz.nextInt();

 Seller s1=new Seller();
 s1.acceptSellingCostPrice(sp,cp);
 s1.showProfitLoss();
}
}
