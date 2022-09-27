package streams;

import java.util.ArrayList;
import java.util.List;

class Product1{
	int id;
	String name;
	float price;
	public Product1(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class Streams3_map_reduce {

	public static void main(String[] args) {
		
		List <Product> productList = new ArrayList<Product>();
		//Adding products
		productList.add(new Product(1,"HP Laptop",25000f));
		productList.add(new Product(1,"Dell Laptop",30000f));
		productList.add(new Product(1,"Lenovo Laptop",28000f));
		productList.add(new Product(1,"Sony Laptop",28000f));
		productList.add(new Product(1,"Apple Laptop",90000f));
		
		//this is more compact approach for filtering data
		Float totalPrice = productList.stream().map(product -> product.price)
				.reduce(0.0f,(sum,price) -> sum+price);	//accumulating price
		System.out.println(totalPrice);
		
		//more precise code
		 float totalPrice2 = productList.stream().map(product -> product.price)
				 .reduce(0.0f, Float::sum);	//accumulating price by referring method of float class
		 System.out.println(totalPrice2);
	}

}
