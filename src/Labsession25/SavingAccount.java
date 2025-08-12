package Labsession25;

public class SavingAccount implements Account{
	int balance;
	int intrestRate = 2;
	public SavingAccount(int initialBalance) {
        int b = initialBalance;
    }
	
	public void deposit(int amount) {
	balance = amount++;
	System.out.println("Deposited Amount" + "savings Amount");
		
	}

		public void withdraw(int amount) {
	balance = amount--;
		System.out.println("withdraw amount" +"balance amount");
	}

	
	public double calculateInterest() {
		int intrest = (balance * intrestRate)/100;
		return 0;
	}

	
	public void viewBalance() {
	System.out.println("SavingAccount Balance" + balance);
		
	}

}
