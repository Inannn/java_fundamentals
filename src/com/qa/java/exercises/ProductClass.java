package com.qa.java.exercises;

public class ProductClass {

	int id;
	String name;
	double price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvaliable;
	static String SELLER_NAME = "QA";
	static String SELLER_CONTACT_NUMBER = "012345678";
	static String SELLER_EMAIL = "qa@hotmail.co.uk";

	public void Product(int id, String name, double price, String category, float rating, float discountPercentage,
			boolean isAvaliable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvaliable = isAvaliable;

	}

	void productInfo() {
		System.out.println("ID:   " + id);
		System.out.println("Name:  " + name);
		System.out.println("Price:  " + price);
		System.out.println("Category:  " + category);
		System.out.println("Rating:  " + rating);
		System.out.println("Discount Percentage:  " + discountPercentage);
		System.out.println("is avaliable:  " + isAvaliable);
		System.out.println();

	}

	double productDiscountPrice() {
		return (price * discountPercentage / 100);
	}

	static void SELLER_CONTACT_DETAILS() {
		System.out.println("seller name" + SELLER_NAME);
		System.out.println("seller name" + SELLER_NAME);
		System.out.println("seller name" + SELLER_NAME);

	}

}
