import java.util.*;
class Product
{  
    private int id;
    private String name;
    private int qty;
    private int rate;
    
    public void setId(int id)
    { this.id=id;
    }
    public int getId()
    { return id;
    }
   

   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }

    public void setQty(int qty)
    { this.qty=qty;
    }
    public int getQty()
    { return qty;
    }
   
     public void setRate(int rate)
    { this.rate=rate;
    }
    public int getRate()
    { return rate;
    }
  }


class CalculateBill
{
  int sum=0;
  Product []p;
  void calBill(Product...p)
  {
    this.p=p;
  }
  void showBill()
  {
   System.out.println("ID"+ "\t"+ "Name" +"\t"+"Qty"+"\t"+ "Rate"+"\t"+ "TotalBill");

 for(i=0 ; i<p.length ; i++)
 {
   p[i].setTotalBill( (p[i].getQty() )*(p[i].getRate())));
  }
 
 System.out.println (p[i].getId() +"\t"+ p[i].getName() +"\t"+ p[i].getQty() +"\t"+ p[i].getRate() +"\t"+ p[i].getTotalBill());

 sum=sum+p[i].getTotalBill();

   System.out.println("Final TotalBill of order is:"+sum);
   }
}

public class Pojo_Que11_ProductBill
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);

CalculateBill c1 = new CalculateBill();
Product p1[]= new Product[4];

for(int i=0 ; i<p1.length ; i++)
{
   p1[i]=new Product();
  
System.out.println("Enter id");
int id=xyz.nextInt();

System.out.println("Enter Name and product");
int id=xyz.nextLine();

     













