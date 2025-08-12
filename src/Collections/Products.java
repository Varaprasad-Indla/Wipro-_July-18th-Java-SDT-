package Collections;

public class Products {
	 String productName;
	    int price;

	    public Products(String productName, int price) {
	        this.productName = productName;
	        this.price = price;
	    }
	    public String toString() {
	        return productName + ":"+ price ;
	    }
	}

