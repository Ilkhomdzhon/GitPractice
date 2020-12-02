package com.syntax.Inheritance;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		
		
		ClassA aa= new ClassA();
		
		int[][] a = { 
                { 1, 2, 3 }, 
                { 4, 5, 6 }, 
                { 7, 8, 9 } 
                                  };
		
		int b = aa.sumOfArray(a);
		System.out.println(b);
		

	}

}
