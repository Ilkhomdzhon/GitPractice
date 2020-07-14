package com.syntax.java;
import java.util.*;
import java.util.Map.Entry;
public class HomeWork203 {

	public static void main(String[] args) {
		
		
//			FIVE : EEE
//			ONE : AAA
//			FOUR : DDD
//			TWO : BBB
//			THREE : CCC
//			------------------
//			HashMap After Replace :
//			FIVE : SUMAIR
//			ONE : AAA
//			FOUR : DDD
//			TWO : BBB
//			THREE : ASEL

		     Map<String,String> map=new HashMap<>();
		     map.put("ONE","AAA");
		     map.put("TWO","BBB");
		     map.put("THREE","CCC");
		     map.put("FOUR","DDD");
		     map.put("FIVE","EEE");

		     System.out.println("HashMap Before Replace : ");
		   
		     Set<Entry<String,String>>entries=map.entrySet();
		     
		     for (Entry ent:entries){
		       System.out.println(ent.getKey()+" : "+ent.getValue());
		       
		     }
		     System.out.println("--------------------------------------");
		     
		     System.out.println("HashMap After Replace : ");
		     
		     map.replace("THREE", "ASEL");
		     map.replace("FIVE", "SUMAIR");
		     
		     
		Iterator<Entry<String,String>> it=entries.iterator();
		
		while(it.hasNext()) {
			Entry<String,String>entry=it.next();
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
					
		}
		
	}

}
