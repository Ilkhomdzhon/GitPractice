package com.java.practise01;

public class Main123 {
	
	
	
		  public static String surround(String s, String search_term) {
				String str="";
				for (int i=0; i<s.length(); i++) {
					if (s.charAt(i)==search_term.charAt(0)) {
			             str=str+"("+s.charAt(i)+")"; 
					} else {
						str=str+s.charAt(i);
					}
				}
				return str;
			
		}
			
			//test case below (dont change):
			public static void main(String[] args){
				System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
				System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
			}
		}


