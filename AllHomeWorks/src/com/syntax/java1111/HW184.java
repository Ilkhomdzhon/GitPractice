package com.syntax.java1111;

import java.util.LinkedList;
import java.util.List;

public class HW184 {

	public static void main(String[] args) {
		
       List<Integer> list=new LinkedList<>();
       
        int a,b,c;
        a=0;
        b=1;
        
         for (int i=0;i<10;i++) {
        	 System.out.print(a+",");
        	 c=a+b;
        	 a=b;
        	 b=c;
        	 
         }
           
        		   
          
		
	}

}
