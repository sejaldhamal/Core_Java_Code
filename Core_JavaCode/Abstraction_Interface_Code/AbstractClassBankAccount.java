import java.util.Scanner;

abstract class BankAccount {
	String accountNumber;              //abstarct class attributes
	double balance;

	BankAccount(double balance, String accountNumber)  //abstarct class constructor to set balance and accountNaumber
	{
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	abstract public void deposit(double amount);    //abstarct method for deposit

	abstract public void withdraw(double amount);   //abstarct method for withdraw

	abstract void applyInterest(double interestRate);    //abstract method for apply interest
}

class SavingAccount extends BankAccount {

	SavingAccount(double balance, String accountNumber)    //child class constructor to pass attributes to parent
	{
		super(balance, accountNumber);   //pass attributes
	}

	@Override
	//check amount was valid or not if valid then add into tha balance
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println(accountNumber + " Sorry, Invalid amount for deposit!!");
		} else {
			System.out.println(accountNumber + " Congartulations!! Your amount is deposited in your account.");
			balance += amount;
			System.out.println("Balance after deposit is: " + balance);   //display balance after deposit
		}

	}

	@Override
	//check amount for withdraw is valid or not 
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println(accountNumber + " Sorry, Insufficient funds!!!");
		} else if (amount <= 0) {
			System.out.println(accountNumber + " Sorry, Invalid withdraw amount !!");
		} else {
			System.out.println("Congartulations!! You withdraw amount.");
			balance -= amount;
			System.out.println("Balance after withdrawal is: " + balance);   //display balance after withdraw
		}
	}

	@Override
	//apply interset rate on balance and add its amount to the balance and display it
	public void applyInterest(double interestRate) {
		double interestAmount = balance * interestRate;
		System.out.println("Your interest amount is: " + interestAmount);
		balance += interestAmount;
		System.out.println(accountNumber + " Your balance after applying intersetrate is: " + balance);
	}
}

public class AbstractClassBankAccount {

	public static void main(String[] args) {

		Scanner xyz = new Scanner(System.in);
		
		//initialize the account number and initail balance in account
		System.out.println("Enter account number: ");
		String accountNumber = xyz.nextLine();
		System.out.println("Enter initial balance in account: ");
		double balance = xyz.nextDouble();

		//create reference of parant and object of child
		BankAccount b = new SavingAccount(balance, accountNumber);
		System.out.println("Enter amount for deposit: ");
		double amount = xyz.nextInt();       
		b.deposit(amount);           //call deposit method 

		System.out.println("Enter amount for withdraw: ");
		amount = xyz.nextInt();
		b.withdraw(amount);          //call wwithdraw method 

		System.out.println("Enter interest rate for amount: ");
		double rate = xyz.nextDouble();
		b.applyInterest(rate);    //call applyInterest method

	}

}
/*
Enter account number: 
SBI1200089
Enter initial balance in account: 
2000
Enter amount for deposit: 
1000
SBI1200089 Congartulations!! Your amount is deposited in your account.
Balance after deposit is: 3000.0
Enter amount for withdraw: 
2000
Congartulations!! You withdraw amount.
Balance after withdrawal is: 1000.0
Enter interest rate for amount: 
0.5
Your interest amount is: 500.0
SBI1200089 Your balance after applying intersetrate is: 1500.0
*/