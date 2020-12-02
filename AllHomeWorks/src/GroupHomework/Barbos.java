package GroupHomework;

public class Barbos {
	
	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		
		dog.breed= "Chappy";
		dog.age = 12 ;
		dog.color = "Black";
		dog.paws = 4 ;
		
System.out.println("I have a "+dog.breed+" he is "+dog.age+" years old"+" and it has "+dog.paws+"and its color is  "+dog.color);
				
	     Dog dog1 = new Dog();
	     
	     dog1.age=333;
	     dog1.color="Pink";
	     dog1.breed ="Barbos";
	 
	      System.out.println(dog1.breed+" "+dog1.color);
	      
	      
	      
	      
	      dog.bark();
	      
	      dog1.bite();
	      
	      dog1.eat();
		
	}

}
