package Labsession25;

public abstract class Rectangle implements interfaceShape{
		 double l;
		 double b;
		 Rectangle(double l,double b){
			 this.l=l;
			 this.b=b;
		 }
		public void getArea1() {
			double area=l*b;
			System.out.println("Drawing Rectangle :"+area);
		}
	 
public void getArea() {
	double area=l*b;
	System.out.println("Drawing Rectangle :"+area);
}

}



