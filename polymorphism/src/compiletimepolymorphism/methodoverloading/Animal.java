package compiletimepolymorphism.methodoverloading;

public class Animal {
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	}

	 class Dog extends Animal {
	   public void eat() {
	      System.out.println("Dog is eating");
	   }
	}

	
