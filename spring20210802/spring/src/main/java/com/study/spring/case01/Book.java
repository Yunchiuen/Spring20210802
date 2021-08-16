package com.study.spring.case01;

public class Book {
	private String name;
	private String price;
	private Author author;

	public Book() {
	}

	public Book(String name, String price, Author author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}

}
