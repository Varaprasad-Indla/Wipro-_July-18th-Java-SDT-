package Labsession24;

public abstract class Bill {

	abstract void generateBill();
	}


	class ElectricityBill extends Bill {
	    private double unitsConsumed;
	    private double ratePerUnit;

	    public ElectricityBill(double unitsConsumed, double ratePerUnit) {
	        this.unitsConsumed = unitsConsumed;
	        this.ratePerUnit = ratePerUnit;
	    }

	   
	    void generateBill() {
	        double total = unitsConsumed * ratePerUnit;
	        System.out.println("Electricity Bill");
	        System.out.println("Units Consumed: " + unitsConsumed);
	        System.out.println("Rate per Unit: $" + ratePerUnit);
	        System.out.println("Total Bill: $" + total);
	    }
	}


	class WaterBill extends Bill {
	    private double cubicMetersUsed;
	    private double ratePerCubicMeter;

	    public WaterBill(double cubicMetersUsed, double ratePerCubicMeter) {
	        this.cubicMetersUsed = cubicMetersUsed;
	        this.ratePerCubicMeter = ratePerCubicMeter;
	    }

	    void generateBill() {
	        double total = cubicMetersUsed * ratePerCubicMeter;
	        System.out.println("Water Bill");
	        System.out.println("Cubic Meters Used: " + cubicMetersUsed);
	        System.out.println("Rate per Cubic Meter: $" + ratePerCubicMeter);
	        System.out.println("Total Bill: $" + total);
	    }
	}


	 class BillTest {
	    public static void main(String[] args) {
	        Bill electricityBill = new ElectricityBill(350, 0.12);
	        Bill waterBill = new WaterBill(50, 0.08);

	        electricityBill.generateBill();
	        System.out.println();  
	        waterBill.generateBill();
	    }
	}
