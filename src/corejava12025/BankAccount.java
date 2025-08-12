package corejava12025;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    abstract double calculateInterest();


    public void printBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

   
    double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}


class FixedDepositAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.065;

    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    
    double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}


abstract class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", 10000);
        BankAccount fd = new FixedDepositAccount("FD456", 20000);

        System.out.println("Savings Account Info:");
        savings.printBalance();
        System.out.println("Interest: " + savings.calculateInterest());

        System.out.println("\nFixed Deposit Account Info:");
        fd.printBalance();
        System.out.println("Interest: " + fd.calculateInterest());
    }
}

