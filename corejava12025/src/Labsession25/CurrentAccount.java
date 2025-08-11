package Labsession25;

public class CurrentAccount implements Account{
	int balance;
	 public CurrentAccount(int Balance) {
	        balance = Balance;
	    }
	public void deposit(int amount) {
	balance = amount++;
	System.out.println();
		
	}


	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		
	}


	public double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void viewBalance() {
		// TODO Auto-generated method stub
		
	}

}
