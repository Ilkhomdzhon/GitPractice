package com.java.practise01;

public class HW103 {
	
	

//In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
//Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

	String breed;
	String color;
	String name; 
	
	 public static void main(String[] args) {
		
		 HW103 dog1=new HW103();
		 
		   dog1.breed="Husky";
		    
		    dog1.bark();
			dog1.run();
			dog1.play();
		 
		   HW103 dog2=new HW103();
		   
		   dog2.breed="Bulldog";
			 
		    dog2.bark();
			dog2.run();
			dog2.play();
		   
		   HW103 dog3=new HW103();
		   dog3.breed="Labrador";                
			dog3.run();                   
			dog3.play();
		    
		    dog3.bark();
			dog3.run();
			dog3.play();
		   
	 }
			void bark() {
				System.out.println(breed+"can bark");
			}
			void run() {
				System.out.println(breed+"can run");
		   }
			void play() {
				System.out.println(breed+"can play");

         }
       }

	 