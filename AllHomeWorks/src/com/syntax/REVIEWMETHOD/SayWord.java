package com.syntax.REVIEWMETHOD;

public class SayWord {
	
	
		 void sayTime(String word, int times) {

			 	 for (int i=0;i<=times;i++) {
			 		 
			 		 System.out.print(word+" ,");
			 		 
			 	 }
			 	
		 }
		 
		 void isRain(boolean rain)  {
			 String is;
			 
			 
			 if (rain) {
				 is="Stay home learn Java";
				 
			 }else {
				 is= "Go to park";
				 
			 }
			 System.out.println(is);
			 
		 }
		 
		 public static void main(String[] args) {
			
		
			 SayWord  say = new SayWord();
			 
			 say.sayTime("Ilhom", 10);
			 
			 say.isRain(false);
			 say.isRain(true);
		 
		 
		 }
		 

}

	 