package com.java.practise01;

public class InstanceVariableDogExample {
	 
	 String name ,size ;
	 int age ;
	 
	 static String breed ="Alabai";
	 static int paws=4;
	 static int tail=1;
	 static int eyes=2;
	 
	 
	 
	 
	 
      void displayDog() {
    System.out.println(name+" likes to eat ,and its size is="+size+" as its age is = "+age+" but its still " +size);
    System.out.println(breed+" has "+paws+" paws and it has "+tail+" tail and  also it has "+eyes+" eyes");
      }

 public static void main(String[] args) {
	 
	  InstanceVariableDogExample dog1=new InstanceVariableDogExample();
	  
	   dog1.name="Bobik";
	   dog1.size="Big";
	   dog1.age=12;
	   dog1.displayDog();
	 
	   InstanceVariableDogExample dog2=new InstanceVariableDogExample();
	   dog2.age=2;
	   dog2.name="Charly";
	   dog2.size="Small";
	   dog2.displayDog();
	 
 }
}