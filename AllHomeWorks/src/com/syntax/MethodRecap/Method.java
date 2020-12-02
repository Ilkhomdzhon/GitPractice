package com.syntax.MethodRecap;

public class Method {

	public static void main(String[] args) {
		
		Calculate cal =new Calculate();
		cal.calculate("Ilkhomdzhon Ishonkulov");
		
		 
	}

}

class Calculate {

	public int calculate(String name) {

		int length = name.length();

		if (length > 15) {
			System.out.println("Your name is too long");
		} else {
			System.out.println("Your are good to go ");
		}

		return length;

	}

}
