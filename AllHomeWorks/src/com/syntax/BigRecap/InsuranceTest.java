package com.syntax.BigRecap;

import java.util.*;

public class InsuranceTest {

	public static void main(String[] args) {
		
			List<Insurance> insurance= new ArrayList<>();
			 
			 insurance.add(new Car("Rav-4","Gieco"));
			 insurance.add(new Pet("Bull-Dog","Pet-insurance"));
			 insurance.add(new Health("State-Farm"));
			 
			
			 	 System.out.println("------ For loop-----------");
			 	 
			 	 for (int i=0;i<insurance.size();i++) {
			 		 insurance.get(i).getQuote();
			 		 insurance.get(i).cancelInsurance();
			 	 }
			 	 
			 	 System.out.println("------- Advanced For loop----------");
			 	 
			 	 
			 	 	 for (Insurance a:insurance) {
			 	 		 a.getQuote();
			 	 		 a.cancelInsurance();
			 	 	 }
			 	 	 
			 	 	 
			 	 	 System.out.println("----------Iterator------------------");
			 	 	 
			 	 	 	Iterator<Insurance> it=insurance.iterator();
			 	 	 	while(it.hasNext()) {
			 	 	 		it.next().getQuote();;
			 	 	 		
			 	 	 	}
			
			
		
		
	}

}
