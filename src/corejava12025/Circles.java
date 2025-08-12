package corejava12025;

public class Circles implements Circleshape{
	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}
	@Override
	public void radius() {
		System.out.println("Radius is 3 units");
		
	}
	public static void main(String[] args) {
		Circles c = new Circles();
		
		c.draw();
		c.radius();
		

	}

	


}
