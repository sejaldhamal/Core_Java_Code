
import java.util.*;
interface Payment
{
   void pay(double amount);
 }
 
 class CreditCardPayment implements Payment
 {
     String CardNo;
	 String CardholderName;
    public CreditCardPayment(String CardNo,String CardholderName)
	{
	   this.CardNo=CardNo;
	   this.CardholderName=CardholderName;
	}
	
	  public void pay(double amount)
	   {
	      System.out.println("Paid " +amount+ " using Credit Card. Card Holder " +CardholderName);
		}
		
  }
  
  class PayPalPayment implements Payment
 {
     String email;

   public PayPalPayment(String email)
	{
	   this.email=email;
	  
	}
	
	 public void pay(double amount)
	   {
	      System.out.println("Paid " +amount+ " using PayPal account. Email: " +email);
		}
		
  }
  
  public class Interface_PayCreditPayPal
  {
  public static void main(String x[])
  {
   Scanner xyz=new Scanner (System.in);
   
    System.out.println("Choose Payment method: 1 for Credit Card, 2 for Paypal");
    int choice=xyz.nextInt();
	
  if(choice==1)
  {
    
   System.out.println("Enter the cardNo");
   String CardNo=xyz.nextLine();
   xyz.nextLine();
   
   System.out.println("Enter the Card holder Name: ");
   String CardholderName=xyz.nextLine();
   
    Payment  =new  CreditCardPayment(CardNo,CardholderName);
	   
  }
   else if(choice==2)
   {
   System.out.println("Enter the PayPal Email Address: ");
   String email=xyz.nextLine();
   
     Payment  =new PayPalPayment(email);
   
      
   }
   else{
	    System.out.println("Invalid Choice");
       }
   

    System.out.println("Enter the amount: ");
    double amount=xyz.nextDouble();
   
    Payment.pay(amount);
   
   
   
  }
}  