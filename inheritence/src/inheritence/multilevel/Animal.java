package inheritence.multilevel;

//Define a superclass named Animal
class Animal {
 
	void eat() 
{
    System.out.println("Animal is eating");
 }
}

//Define a subclass named Dog that inherits from Animal

class Dog extends Animal {
 void bark() 
 {
     System.out.println("Dog is barking");
 }
}

//Define another subclass named puppy that inherits from Dog
class Puppy extends Dog {
 void run() 
 {
     System.out.println("PUPPY is running");
 }
}






