package corejava12025;

public class Payment {
	public void pay(double amount) {
        System.out.println("Paying " + amount + " using a generic payment method.");
    }
}
class CreditCard extends Payment {
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
    }
}
class UPI extends Payment {
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using UPI.");
    }
}

class NetBanking extends Payment {
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Net Banking.");
    }
}




	public static void main(String[] args) {

		double amount = 1000.0;

        Payment payment;

        payment = new CreditCard();
        payment.pay(amount);

        payment = new UPI();
        payment.pay(amount);

        payment = new NetBanking();
        payment.pay(amount);
    }
}
