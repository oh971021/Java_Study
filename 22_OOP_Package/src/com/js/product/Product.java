package com.js.product;

public class Product {
	String name;
	int price;
	
	public Product() {}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(price);
	}
}
