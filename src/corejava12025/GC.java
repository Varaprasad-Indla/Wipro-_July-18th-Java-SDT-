package corejava12025;

public class GC {
	
	public void finalize () {
	System.out.println("object is garbage collected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		GC obj = new GC();
		
		obj = null;
		
		GC obj1 = new GC();
		GC obj2 = new GC();
		
		obj1 = obj2 ;
		
		
		GC obj4 = new GC();
		
		Runtime.getRumtime().gc()
				

	}

}
