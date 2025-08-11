package corejava12025;

public class StaticVariables {
	//variables declared at class level with static keywords
	public static String studentName = "Varaprasad";
	
	public String college= "Pace ITS";
	
	public static int studid = 234;
	
	
	
	public static void main(String[] args) {
		
		StaticVariables sv = new StaticVariables();
		
		System.out.println(studentName);
		System.out.println(studid);
		// TODO Auto-generated method stub
		System.out.println(sv.college);	
	}

}
