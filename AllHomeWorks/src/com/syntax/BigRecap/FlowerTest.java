package com.syntax.BigRecap;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {

		Flower rose = new Rose("Roza");
		Flower tulip = new Tulip("Tulpan");
		Flower gvazdika = new Gvozdika("Gvazdika");
		
		
		Flower [] flowers = {rose ,tulip , gvazdika};
		
		
//			 for (Flower flower : flowers) {
//				 
//				 flower.bloom();
//		
//				 flower.sell();
//				
//			}
		
			ArrayList<Flower> flower = new ArrayList<>();
			
				 flower.add(new Rose("Roza"));
				 flower.add(new Tulip("Tulpan"));
				 flower.add(new Gvozdika("Gvazdika"));
				 
				 
//				  for (Flower flower2 : flower) {
//					  flower2.bloom();
//					  flower2.sell();
//					
//				}
				 
				 System.out.println("++++=iterator=========");
				Iterator<Flower>iterator= flower.iterator();
				while (iterator.hasNext()) {
					iterator.next().bloom();
				
				}
						System.out.println("-------========------------ ");
				 for (int i=0;i<flower.size();i++) {
					 flower.get(i).bloom();
					 flower.get(i).sell();
				 }
			
	}

}
