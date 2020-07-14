package com.java.practise01;

public class Howmanytimes {

	void say(String sentence, int times ) {
		
		 for (int i=1; i<=times;i++) {
			 System.out.println(sentence); 
		 }
		
		
			
		
	}
	 
	public static void main(String[] args) {
		
		Howmanytimes obj=new Howmanytimes();
		 obj.say("Welcome To Syntax Technologies", 3);
		
	}
}
