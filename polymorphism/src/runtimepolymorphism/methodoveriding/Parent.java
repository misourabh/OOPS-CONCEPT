package runtimepolymorphism.methodoveriding;

public class Parent 
{
   public void m1()
   {
	   System.out.println("FROM PARENT CLASS M1()");
   }
   
}
     class Child extends Parent
     {
    	 public void m1()
    	 {
    		 System.out.println("FROM CHILD CLASS M1()");
    	 }
     }
       
