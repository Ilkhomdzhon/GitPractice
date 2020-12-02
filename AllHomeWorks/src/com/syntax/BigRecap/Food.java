package com.syntax.BigRecap;

public abstract class Food {

	String foodType;
	String nationality;

	public Food(String foodType, String nationality) {
		this.foodType = foodType;
		this.nationality = nationality;

	}

	public abstract void foodLike();

	public abstract void eatFood();

	public abstract void guest();

}

class Tajikistan extends Food {

	public Tajikistan(String foodType, String nationality) {
		super(foodType, nationality);

	}

	@Override
	public void foodLike() {
		System.out.println(nationality + " likes " + foodType + " very much!");
	}

	@Override
	public void eatFood() {
		System.out.println(nationality + " eat " + foodType + " everytime");
	}

	@Override
	public void guest() {
		System.out.println(nationality + " cook " + foodType + " when they have guests");
	}
}

class Russia extends Food {

	public Russia(String foodType, String nationality) {
		super(foodType, nationality);

	}

	@Override
	public void foodLike() {
		System.out.println(nationality + " likes " + foodType + " everytime");
	}

	@Override
	public void eatFood() {
		System.out.println(nationality + " eat " + foodType + " with VODKA");
	}

	@Override
	public void guest() {
		System.out.println(nationality + "cook " + foodType + " when they drunk");
	}

}

class Kazakstan extends Food {

	public Kazakstan(String foodType, String nationality) {
		super(foodType, nationality);

	}

	@Override
	public void foodLike() {
		System.out.println(nationality + " likes " + foodType + " everytime");

	}

	@Override
	public void eatFood() {
		System.out.println(nationality + " eat " + foodType + " with Kimiz");

	}

	@Override
	public void guest() {
		System.out.println(nationality + "cook " + foodType + " when they drunk of KIMIZ");

	}

}

class Turkey extends Food {

	public Turkey(String foodType, String nationality) {
		super(foodType, nationality);

	}

	@Override
	public void foodLike() {
		System.out.println(nationality + " likes " + foodType + " everytime");

	}

	@Override
	public void eatFood() {
		System.out.println(nationality + " eat " + foodType + " with BlackTea");

	}

	@Override
	public void guest() {
		System.out.println(nationality + "cook " + foodType + " when they drunk of Raki");

	}

}
