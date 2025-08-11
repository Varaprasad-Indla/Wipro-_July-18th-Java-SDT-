package LabSessionday4;

abstract class Vehicle {
	
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
	        System.out.println("Bus is moving on six wheels");
	    }
	}

	
	abstract class Main {
	    public static void main(String[] args) {
	        Vehicle c = new Car();
	        Vehicle b = new Bike();
	        Vehicle b1 = new Bus();

	        c.move();
	        b.move();
	        b1.move();
	    }
	}

