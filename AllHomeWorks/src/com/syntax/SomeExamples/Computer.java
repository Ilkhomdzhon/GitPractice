package com.syntax.SomeExamples;

public class Computer {

	String brand;
	int memory;

	public Computer(String brand, int memory) {
		this.brand = brand;
		this.memory = memory;

	}

	public void work() {
		System.out.println("My " + brand + " works without pluged 2 hours");
	}

	public void memorySize() {
		System.out.println("My" + brand + " memory size is " + memory);
	}

}

class Apple extends Computer {

	public Apple(String brand, int memory) {
		super(brand, memory);

	}

	@Override
	public void work() {
		System.out.println("My " + brand + " works without plugged in up to 5 hours");
	}

	public void memorySize() {
		System.out.println("My " + brand + " can have memory up to " + memory + " terabyte");
	}

	public void bestSeller() {
		System.out.println(brand + " is best selled computers in the world");
	}

	public void access() {
		super.work();
		super.memorySize();

	}

}

class Lenova extends Computer {

	public Lenova(String brand, int memory) {
		super(brand, memory);

	}

	public void work() {
		System.out.println("My " + brand + " works without pluged 2 hours");
	}

	public void memorySize() {
		System.out.println(brand + " can have memory to " + memory + " terabyte");

	}
}

class HP extends Computer {

	public HP(String brand, int memory) {
		super(brand, memory);

	}

	public void work() {
		System.out.println("My " + brand + " works" + "without pluged 1:30 hours");
	}

	public void memorySize() {
		System.out.println(brand + " can have memory up to " + memory + " terabyte");
	}

}

class Dell extends Computer {

	public Dell(String brand, int memory) {
		super(brand, memory);
	}
	
	public void work() {
		System.out.println("My " + brand + " works" + "without pluged 1:30 hours");
	}

	public void memorySize() {
		System.out.println(brand + " can have memory up to " + memory + " terabyte");
	}
	

}
