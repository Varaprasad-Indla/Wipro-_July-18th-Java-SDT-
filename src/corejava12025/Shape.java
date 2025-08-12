package corejava12025;

abstract class Shape {
	abstract double calculateArea();
	}

	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    
	    public Circle() {
			// TODO Auto-generated constructor stub
		}


		double calculateArea() {
	        return Math.PI * radius * radius;
	    }


		public void draw() {
			// TODO Auto-generated method stub
			
		}


		public void radius() {
			// TODO Auto-generated method stub
			
		}
	}

	class Rectangle extends Shape {
	    private double length, width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    
	    double calculateArea() {
	        return length * width;
	    }
	}

	abstract class Main {
	    public static void main(String[] args) {
	        Shape circle = new Circle(3.0);
	        Shape rectangle = new Rectangle(2.0, 3.0);

	        System.out.println("Area of Circle: " + circle.calculateArea());
	        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
	    }
	}