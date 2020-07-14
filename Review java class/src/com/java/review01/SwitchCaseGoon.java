package com.java.review01;

public class SwitchCaseGoon {

	public static void main(String[] args) {

		String animal = "cow";

		switch (animal) {
		
		case  "honey bee" :
			System.out.println("Makes Honey ");
			break;
		case "Red bee":
			System.out.println("Doesn't make honey");
			break;
		case "OON bee":
			System.out.println("I don' know what does it do");
			break;
		case "sheep":
			System.out.println("Good meat ");
			break;
		case  "cow" :
			System.out.println("Good milk ");
		break;
		
			 default:
				 System.out.println("You entered wrong animal or insect");
				 break;
		}
		
		

	}

}
