package com.syntax.BigRecap;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {

		Food[] food = { new Tajikistan("Osh ", "Tajik"), new Russia("Borsh", "Russian"),
				new Kazakstan("Beshparmak", "Kazaks"), new Turkey("Kebap", "Turks") };

		ArrayList<Food> foods = new ArrayList<>();

		foods.add(new Tajikistan("Osh", "Tajik"));
		foods.add(new Russia("Borsh", "Russian"));
		foods.add(new Kazakstan("Beshparmak", "Kazaks"));
		foods.add(new Turkey("Kebap", "Turks"));
		
		
		
		System.out.println("-----Using for loop---------");
		for (int i=0;i<foods.size();i++) {
					foods.get(i).eatFood();
					foods.get(i).guest();
					foods.get(i).foodLike();
			
		}
		
		
			 System.out.println("==========Using Advanced for Loop=============");
			 
			 
			 for(Food foo:foods) {
				 foo.eatFood();
				 foo.foodLike();
				 foo.guest();
				 
			 }
		
		
			 System.out.println("***************-Using Iterator-***************");
			 
			Iterator<Food> iterator=foods.iterator();
			
				 while(iterator.hasNext()) {
					 iterator.next().guest();
					 iterator.next().eatFood();
					 iterator.next().foodLike();
				 }
			 
		
	}

}
