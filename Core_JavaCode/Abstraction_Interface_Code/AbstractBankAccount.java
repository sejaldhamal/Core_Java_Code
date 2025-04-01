

abstract class BankAccount {
     double balance;
     String AccountNumber;
	 
	abstract void deposit(double amount);
	
	abstract void withdraw(double amount);
	
	abstract void ApplyIntrest();
	
	
} 

 class SavingAccount extends BankAccount
 { 

    SavingAccount(double balance,double AccountNumber)
	{
      this.balance=balance;
      this.AccountNumber=AccountNumber;
	}	  
   void deposit(double amount) 
   {
        balance=balance+amount;
        System.out.println("Deposited: $" + amount);
		if(amount<=0)
		{
			System.out.println("Insufficient amount Entered");
        }
	   }
     
     void withdraw(double amount,double balance)
	 {

        if (amount>balance) {
			{
            System.out.println("Insufficient Fund");
			}
			
          if(amount<=0)
		 {
			 System.out.println("Invalid withdraw Amount");
		 }

          else{
		   balance=balance-amount;
            System.out.println("Withdrawn: $" + amount);
			System.out.println("balance:"+balance);
            }
       }
	   
	  abstract void applyIntrest(double intrestrate)
	   {
		   intrestrate=balance*0.25;
		   balance=balance+intrestrate;
		   System.out.println("Intrestrate is:"+intrestrate);
	   }
	 } 
		   

	public class AbstractBankAccount
	{
    public static void main(String x[])
	{
        BankAccount s = new SavingAccount();
    
        
        System.out.println("Saving Account");
        s.deposit(100);
       
        s.withdraw(30);
        
        s.ApplyIntrest(0.25); 
   }
}
 

 }
