package com.collection.oct;

public class BookD {

	String name;
	float price;
	String author;
	int version;

	BookD(int version, String name, float price) {

		this.version = version;
		this.name = name;
		this.price = price;

	}

	BookD(int version, String name, float price, String author) {
		this(version, name, price);
		this.author = author;

	}

	public String toString() {
		return name + "" + author + "" + price + "" + version;

	}

}
