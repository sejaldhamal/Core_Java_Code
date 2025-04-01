

abstract class BankAccount {
     double balance;
     String AccountNumber;
   
    public void deposit(double amount) {
        balance=balance+amount;
        System.out.println("Deposited: $" + amount);
		if(amount<=0)
		{
			System.out.println("Insufficient amount Entered")
    }

   
    public void withdraw(double amount) {
        double transactionFee = getTransactionFee();
        if (amount + transactionFee <= balance) {
            balance=balance-(amount + transactionFee);
            System.out.println("Withdrawn: $" + amount + " (Fee: $" + transactionFee + ")");
        } else {
            System.out.println("Insufficient balance for withdrawal!");
        }
    }

  
    public double getBalance() {
        return balance;
    }

  
    protected abstract double getTransactionFee();
}


class SavingAccount extends BankAccount {
   
    protected double getTransactionFee() {
        return 2; 
    }
}




public class Abstract_BankAccount {
    public static void main(String[] args) {
        BankAccount s = new SavingAccount();
    
        
        System.out.println("Saving Account");
        s.deposit(100);
        System.out.println("Balance: " + s.getBalance());
        s.withdraw(30);
        System.out.println("Balance: " + s.getBalance());
        s.withdraw(70); 
        System.out.println("Balance: " + s.getBalance());

	}
}
 


