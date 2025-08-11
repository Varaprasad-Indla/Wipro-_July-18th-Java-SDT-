package Labsession25;

public class Trianlge implements interfaceShape{
		int base;
		int height;
		void Trianlge(int base,int height){
			this.base=base;
			this.height=height;
		}

	public void getArea() {
		double area=0.5*base*height;
		System.out.println("Drawing triangle : "+area);
	}


}
