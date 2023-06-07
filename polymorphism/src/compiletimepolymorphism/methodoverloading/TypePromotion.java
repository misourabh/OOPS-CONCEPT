package compiletimepolymorphism.methodoverloading;

public class TypePromotion
{ 

	public static void main(String[] args) 
	{
		add(10,20);
    }
     public static void add(int a,char b)
     {
    	 System.out.println("FROM ADD (INT A, double B)");
     }
     public static void add(int a, double b)
     {
    	 System.out.println("FROM ADD (INT A , CHAR B)");
     }

}
