package com.syntax.BigRecap;

public class Book {
	
	String name , lastName;
	
	
	public Book(String name ) {
		this.name=name;

		
	}
	
	public Book(String lastName, int aa) {
		this.lastName=lastName;
		
	}
	
	public void displayInfo() {
		System.out.println(this.name+this.lastName);
	}
	
	public static void main(String[] args) {
		
		Book book = new Book("Ahmad") ;
			Book bk=new Book("Ahmad",12);
			bk.displayInfo();
		book.displayInfo();
	}

}
