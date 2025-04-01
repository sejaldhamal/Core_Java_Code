
/*Q2. WAP to create class name as Product as POJO class with field id,name and qty and price and you have to create Shop as class with following methods 
void setProducts(Customer customer,Product …p): this method can accept the n number of products 
void findBill(): this function can find the bill of a customer using the following format.

customername:ram    id=1     address:pune
Id     name     quantity    rate   total
1       A          10        10    100
2       B          20        10    200
*/


class Product
{
  private int id;
  private String name;
  private int qty;
  private int price;
  
 
	 
 public void setId(int i)
 {id=i;
  }
  public int getId()
 {
  return id;
  }


  
  public void setName(String n)
 {
   name=n;
  }
   public String getName()
 {
  return name;
  }
  
  public void setQty(int q)
 {
   qty=q;
  }
   public int getQty()
 {
  return qty;
  }


  public void setPrice(int p)
 {
   price=p;
  }
   public int getPrice()
 {
  return price;
  }
  
}

class Customer
{
  private String name;
  private int id;
  private String Address;
  

  public void setName(String n)
  {name=n;
  }
  public String getName()
  { return name;
  }

  public void setId(int i)
  {id=i;
  }
  public int getId()
  { return id;
  }
  
  public void setAddress(String a)
  {Address=a;
  }
  public String getAddress()
  { return Address;
  }
}

class Shop
{
  private Customer c;
  private Product[] p;
  void setProducts(Customer c,Product ...p) 
  {
    this.c=c;
	this.p=p;
	}
	
 void findBill()
 {
     System.out.println("customer Name:"+c.getName()+"\tID:"+c.getId()+"\tAddress:"+c.getAddress());
	 System.out.println("Id   Name  Quantity  Rate  Total");
	 

     for(int i=0 ; i<p.length ; i++)
	 {
       System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getPrice()+"\t"+(p[i].getQty()*p[i].getPrice()));
	  }
 }
 
 
 
}
 

public class PojoEmpDataRevQ
{
  public static void main(String x[])
  {
     Product p1=new Product();
	 
	Customer c1=new Customer();
	 Shop s1=new Shop();
 
     p1.setId(1);
	 p1.setName("A");
	 p1.setQty(10);
	 p1.setPrice(10);
	 
	 Product p2=new Product();
	 p2.setId(1);
	 p2.setName("B");
	 p2.setQty(20);
	 p2.setPrice(10);
	 
	
	 
	 c1.setName("Ram");
	 c1.setId(1);
	 c1.setAddress("Pune");
	 
	 s1.setProducts(c1,p1,p2); 
	 
	 s1.findBill();
	 
	}
}