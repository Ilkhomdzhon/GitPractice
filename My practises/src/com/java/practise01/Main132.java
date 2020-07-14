package com.java.practise01;

public class Main132 {
		  
		  String countryName;
		  String capital;
		  int populationSize;
		  
		   void display(){
		     System.out.println("The capital of "+countryName+" is "+capital+" and population is "+populationSize);
		   }
		  
		   public static void main(String[] args){
		     
		   
		     
		       Main132 usa= new Main132();
		       usa.countryName="USA";
		       usa.capital="Washington DC";
		       usa.populationSize=330000000;
		       
		         usa.display();
		      
		         
		         Main132 kazak=new Main132();
		         
		         kazak.countryName="Kazakhstan";
		         kazak.capital="Astana";
		         kazak.populationSize=18500000;
		         
		           kazak.display();
		   }
		   
		  
		}

