package compiletimepolymorphism.methodoverloading;

public class MainAnimal {
	 
		   public static void main(String[] args) {
		      Animal animal = new Animal();
		      Dog dog = new Dog();

		      animal.eat(); // Output: Animal is eating
		      dog.eat(); // Output: Dog is eating

		      Animal animal2 = new Dog();
		      animal2.eat(); // Output: Dog is eating (method shadowing occurs)
		   }
		}


