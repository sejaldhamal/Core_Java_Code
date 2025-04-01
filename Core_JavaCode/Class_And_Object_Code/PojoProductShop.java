class Product
{
private String name;
private int id;
private int price;
private String company;


public void setName(String n)
{
name=n;
}
public String getName()
{
return name;
}


public void setId(int i)
{
id=i;
}
public int getId()
{
return id;
}

public void setPrice(int p)
{
price=p;
}
public int getPrice()
{
return price;
}


public void setCompany(String c)
{
company=c;
}
public String getCompany()
{
return company;
}
}

class Shop
{
Product prod;
void addNewProduct(Product p)
{
prod=p;
}
void showProduct()
{
System.out.println("Name is " +prod.getName());
System.out.println("Id is " +prod.getId());
System.out.println("Price is " +prod.getPrice());
System.out.println("Company is " +prod.getCompany());

}
}  

public class PojoProductShop
{
public static void main(String x[])
{
Shop s1=new Shop();
Product p1=new Product();

p1.setId(1);
p1.setName("RAM");
p1.setPrice(28000);
p1.setCompany("PUNE");


s1.addNewProduct(p1);
s1.showProduct();
 }
}








