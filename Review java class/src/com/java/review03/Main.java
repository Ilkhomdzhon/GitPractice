package com.java.review03;

public class Main {
		  
		  public static int countVowels(String s) {
			    s=s.toLowerCase();
			    int c=0;
			    char[] vowels= {'a','e','i','o','u'};
			    for (int i=0; i<s.length(); i++) {
			    	for(int j=0; j<vowels.length; j++) {
			    		if (s.charAt(i)==vowels[j]) {
			    			c++;
			    		}
			    	}
			    }
			    return c;
			  }
				//test case below (dont change):
				public static void main(String[] args){
					System.out.println(countVowels("obama")); //3
					System.out.println(countVowels("happy friday! i love weekends")); //9

		}
		}

