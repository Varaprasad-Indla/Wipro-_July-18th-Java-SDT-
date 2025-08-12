package Labsession25;

public class Circl implements interfaceShape{
	double radius;
	 Circl(double radius){
		 this.radius=radius;
	 }
	
	public void getArea() {
		double area=3.14*radius*radius;
		System.out.println("Drawing circle : "+area);
	}
 
	 
	}


