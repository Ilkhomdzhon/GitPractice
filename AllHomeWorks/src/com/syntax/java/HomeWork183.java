package com.syntax.java;

import java.util.LinkedList;

public class HomeWork183 {

	public static void main(String[] args) {
	    LinkedList<Integer> llist= new LinkedList<>();
	    for(int i=50; i<101; i++){
	      if(i%3==0){
	        llist.add(i);
	      }
	    }
	    System.out.println(llist);
}
}
