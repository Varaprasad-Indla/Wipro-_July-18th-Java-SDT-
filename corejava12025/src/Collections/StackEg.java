package Collections;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		 Stack<String> s = new Stack<>();
		 	s.push("Vara");
	        s.push("Prasad");
	        s.push("Sai");
	        s.push("Praveen");
	        
	        System.out.println(s);
	        System.out.println(s.push("Sai"));
	        System.out.println(s.pop());
	        System.out.println(s.empty());
	        System.out.println(s.peek());
	        System.out.println(s.search("Vara"));
	        System.out.println(s.firstElement());
	        System.out.println(s.lastElement());
	        
	}

}
