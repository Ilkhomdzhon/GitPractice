package com.java.practise01;

public class UpperandLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "WELCOME TO SYNTAX MEMORY    ";
		System.out.println(str1.toLowerCase());

		str1 = str1.toLowerCase();
		System.out.println(str1);     ///harf mayda 

		str1 = str1.toUpperCase();    /// harf katta 
		System.out.println(str1);

		boolean mem = str1.contains("TO");   //proverka kiladi usha harf yo jumla bor yoki yuk
		System.out.println(mem);
		
		boolean mom=str1.startsWith("L");
		System.out.println(mom);                ///prove.kil usha harf bilan boshlaydimi 

		boolean dad=str1.isEmpty();
		System.out.println(dad);       /// proverka kil bush mi ?
		
		//String bab=str1.trim();
		System.out.println(str1.trim()); /// bush spacelarni olib tashla
		    
		   System.out.println("=======CHAR+============");   
		
		char bob=str1.charAt(3);   /// 3 chi harf c 
		System.out.println(bob);  
		
		String Str1 = new String ("Ladies and Gentlemens Welcome on board");
		System.out.println(Str1.indexOf('q')); /// agar berilgan harf busa aytadi bumasa -1 beradi 
		
		String un=Str1.substring(0);//// kaysi harftan boshlashni berasan misol 0 boshtan 
		                                   ///boshlaydi 10 bersamg 10 dan boshlaydi 
		System.out.println(un);
		
		System.out.println(str1.substring(1, 12));
		
		String mix="231230i213-0iHELLOdskfnsdkihavecarfnsodnn342&$^$^&&";
		
		System.out.println(mix.replaceAll("[^abc]", "*"));
		System.out.println(mix.replaceAll("[A-Za-z]", "-"));
		System.out.println(mix.replaceAll("[^A-Za-z0-9]", "-"));
		
		String subject="I love Java and I want to learn more";
		String []split=subject.split("");
		
	System.out.println(split.length);
		
		for (int i=0; i<split.length;i++) {
			System.out.print(split[i]);
		}
		System.out.println("============-----------===============----------=============");
	 String m= "Good Morning ";
	 String n= " Dear all ";
	 String v= " Welcome everybody ";
	 
		m=m.trim().concat(m).concat(n).concat(v);
		System.out.println(m);
		
		char letter ; 
		for (int i=0; i<subject.length();i++) {
			letter=subject.charAt(i);
			System.out.print(letter);
			
			 letter=m.charAt(3);
			 System.out.println(letter);
			
			
		}
		System.out.println("++++++===========+++++++++++=================");
		String name ="Syntax Technology";
		
		int ttt=name.indexOf("T");
		System.out.println(ttt);
		
		ttt=name.indexOf("Technology");
		System.out.println(ttt);
		
		ttt=name.indexOf("W");
		System.out.println(ttt);
		
		ttt=name.charAt(1);
		System.out.println(ttt);
	}
	
}
