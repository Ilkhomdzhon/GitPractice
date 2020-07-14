package com.java.practise01;

public class TestExercise {
	static String thirdLetter (String s){
		  String yordamchi="";
		  for(int i=0; i<s.length(); i+=3){
		    yordamchi=yordamchi+s.charAt(i);
		  }
		  return yordamchi;
		}
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(thirdLetter("hello there")); //"hltr"
			System.out.println(thirdLetter("technology")); //"thly"
		}
}
