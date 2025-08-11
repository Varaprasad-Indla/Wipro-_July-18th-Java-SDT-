package corejava12025;

public class NullPointerException {

	public static void main(String[] args) {
		try {
			String S1 = null;
			System.out.println(S1.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
