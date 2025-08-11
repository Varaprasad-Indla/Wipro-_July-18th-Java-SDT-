package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonofProducts implements Comparator<Products> {
	public int compare(Products p1, Products p2) {
        return p1.price - p2.price;
    }


	public static void main(String[] args) {
		List<Products> products = new ArrayList<>();

        products.add(new Products("Water Bottle",200));
        products.add(new Products("Mobile",30000));
        products.add(new Products("Bag",1500));
        products.add(new Products("Shoes",2000));

        Collections.sort(products, new ComparisonofProducts());

        for (Products p : products){
            System.out.println(p);
        }
    }
}
 
	

