package Labsession24;

public abstract class Vehicle {
	abstract void move();
	}

	
	class Car extends Vehicle {
	   
	    void move() {
	        System.out.println("Car is moving on four wheels");
	    }
	}


	class Bike extends Vehicle {
	    
	    void move() {
	        System.out.println("Bike is moving on two wheels");
	    }
	}

	
	class Bus extends Vehicle {
	  
	    void move() {
	        System.out.println("Bus is moving on multiple wheels");
	    }
	}

	
	 class VehicleTest {
	    public static void main(String[] args) {
	        Vehicle v1 = new Car();
	        Vehicle v2 = new Bike();
	        Vehicle v3 = new Bus();

	        v1.move();  
	        v2.move();  
	        v3.move();  
	    }
	}