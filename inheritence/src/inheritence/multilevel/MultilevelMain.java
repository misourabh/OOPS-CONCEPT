package inheritence.multilevel;

public class MultilevelMain {
	
	public static void main(String[] args) 
	{
	     Puppy myPuppy = new Puppy();
	     myPuppy.eat();  // calls eat() method from superclass Animal
	     myPuppy.bark(); // calls bark() method from immediate superclass Dog
	     myPuppy.run();  // calls run() method from puppy class
	 }

}
