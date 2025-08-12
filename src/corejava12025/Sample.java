package corejava12025;

final class Sample {
	final int value = 25;
	
	final void draw() {
		System.out.println("final method cannot be override");
		System.out.println("final method cannot be override" + value);
	}
	
class child extends Sample {
	void draw() {
		System.out.println("trying to override");
	}
}
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.draw();

	}
}
