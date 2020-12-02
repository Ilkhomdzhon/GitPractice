package com.syntax.BigRecap;

public abstract class Flower {

	String flowerType;

	public Flower(String flowerType) {
		this.flowerType = flowerType;

	}

	public abstract void bloom();
	public abstract void sell();
	

}

class Rose extends Flower {

	public Rose(String flowerType) {
		super(flowerType);

	}

	public void bloom() {
		System.out.println(flowerType + " blooms in June");

	}

	@Override
	public void sell() {
		System.out.println(flowerType+" sell roses makes good money");
		
	}
}

class Tulip extends Flower {

	public Tulip(String flowerType) {
		super(flowerType);

	}

	public void bloom() {
		System.out.println(flowerType + " blooms in August");
	}

	@Override
	public void sell() {
		System.out.println(flowerType+" doesn't make good money by selling ");
		
	}
}

class Gvozdika extends Flower {

	public Gvozdika(String flowerType) {
		super(flowerType);

	}

	public void bloom() {
		System.out.println(flowerType + " blooms anytime");
	}

	@Override
	public void sell() {
		System.out.println(flowerType+" No one need this ,not popular");
		
	}

}
