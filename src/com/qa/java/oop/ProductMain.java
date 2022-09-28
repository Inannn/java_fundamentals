package com.qa.java.oop;

public class ProductMain {

	public static void main(String[] args) {
		int x;
		x = 50;

		Product product;
		product = new Product();// a product object is created
		System.out.println("id" + product.id);
		System.out.println("name" + product.name);
		System.out.println("price" + product.price);
		System.out.println("category" + product.category);
		System.out.println("rating" + product.rating);
		System.out.println("discount percentage" + product.discountPercentage);
		System.out.println("Is available" + product.isAvailable);
	}

}
