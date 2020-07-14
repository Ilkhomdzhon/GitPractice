package com.syntax.java;

public class HomeWork130 {
	
//	For you to do:
//Please create methods with different access modifiers (one for each access modifier) 
//and call them properly in main method one by one
//		 
//		In each method write the logic accordingly like for private method write the 
//		logic in the println Statement as "This is Private Method" accordingly for rest of the 
//		methods that have different access modifiers should be a total of 4 outputs, please make sure 
//		they are in the same order that is printed below.
//
//		Expected Output:
//		This is Private Method
//		This is Default Method
//		This is Protected Method
//		This is Public Method
//	

	 private void isPrivate () {
		 System.out.println("This is Private Method ");
	 }
	 
	 void isDefault (){
		 System.out.println("This is Default Method");	 
	 }
	 
	 protected void isProtected() {
		 System.out.println("This is Protected Method");
	 }
	 public void isPublic() {
		 System.out.println("This is Public Method");
	 }
	 public static void main(String[] args) {
		
		 
		 HomeWork130 priv=new HomeWork130();
		 priv.isPrivate();
		 
		 HomeWork130 def=new HomeWork130();
		 def.isDefault();
		 
		 HomeWork130 pro=new HomeWork130();
		 pro.isProtected();
		 
		 HomeWork130 pub=new HomeWork130();
		 pub.isPublic();
	}
}
