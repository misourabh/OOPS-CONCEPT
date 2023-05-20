package inheritence.singlelevel;

public class SinglelevelMain {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		
		System.out.println("USING PARENT CLASS OBJECT WE ONLY ACCESS THE PARENT CLASS MEMBERS ");
		
		animal.move();
		
		System.out.println("WE ARE NOT SUPPOSED TO ACCESS THE CHILD CLASS MEMBERS");
		
		//animal.bark();  
}

}
