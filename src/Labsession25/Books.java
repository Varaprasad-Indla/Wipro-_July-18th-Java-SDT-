package Labsession25;

public class Books {
	private String title;
    private String author;
    private int isbn;
    private boolean isAvailable;
    
    
    public String getTitle() {
        return title;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }   
    public void setauthor(String author) {
    	this.author = author;
    }
    
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int Isbn) {
    	this.isbn = Isbn;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setisAvailable(boolean isAvailable) {
        	this.isAvailable = isAvailable;
        }
        
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }
	

	public static void main(String[] args) {
		Books obj= new Books();	
		obj.settitle("Dreaming");
		obj.setauthor("Author");
		obj.setIsbn(234);
		obj.setisAvailable(true);
	
	}	

}
