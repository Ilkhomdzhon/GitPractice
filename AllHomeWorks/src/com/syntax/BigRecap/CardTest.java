package com.syntax.BigRecap;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CardTest {

	public static void main(String[] args) {

		List<Card> card = new LinkedList<>();

		card.add(new Visa("Visa", 700));
		card.add(new Master("Master", 650));
		card.add(new Amex("American Express CC", 900));
		
		
//			 for (int i=0;i<card.size();i++) {
//				 card.get(i).apply();
//				 card.get(i).improveScore();
//			 }
		
		
//			 for (Card c:card) {
//				 c.improveScore();
//				 c.apply();
//			 }

			 Iterator<Card>cc=card.iterator();
			 	 
			 	 while (cc.hasNext()) {
			 		Card kard= cc.next();
			 		kard.apply();
			 		kard.improveScore();
			 	 }
			 
	}

}
