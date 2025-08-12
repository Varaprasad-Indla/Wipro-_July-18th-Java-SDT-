package corejava12025;

public class MainClass {
    public static void main(String[] args) {
        try {
         
            Book book = new Book(1, "Romeo and Juliet", "William Shakespeare", 234);
            System.out.println(book);

            
            Book badBook = new Book(-2, "", "", 0);
        } catch (InvalidBookException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}