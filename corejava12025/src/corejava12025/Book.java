package corejava12025;

public class Book {
	private String title;
    private String author;
    private int pages;

    public Book(int id, String title, String author, int pages) throws InvalidBookException {
        validateId(id);  
        validateBook(title, author, pages);
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

	private void validateId(int id) throws InvalidBookException{
		if (id <= 0) {
            throw new InvalidBookException("Book ID must be a positive number.");
        }		
	}

	private void validateBook(String title, String author, int pages) throws InvalidBookException {
        if (title == null || title.trim().isEmpty()) {
        	throw new InvalidBookException("Title must not be empty.");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new InvalidBookException("Author must not be empty.");
        }
        if (pages <= 0) {
            throw new InvalidBookException("Pages must be a positive number.");
        }
    
        }
	public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }

    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pages=" + pages + "]";
    }
}

				
	





