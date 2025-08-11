package corejava12025;

class Animal {
	public void eat() {
		System.out.println("Animals eat food");
	
	}
}

class Dog extends Animal {
	
	public void bark() {
		System.out.println("Dog barks");
	}
			
}

	class cat extends Animal {
	
	public void meow() {
		System.out.println("Cat meow");
		
	}
}

	class Cow extends Animal{
	
		public void moo() {
		System.out.println("Cow moo");	

class Animal {
	
	
	public static void main (String[] args){
		
		Dog d = new Dog ();
		
		d.eat();
		d.bark();
		
		cat c = new cat();
		
		c.eat();
		c.meow();
		
		Cow cw = new Cow ();
		
		cw.eat();
		cw.moo();
	}
	
		
	}