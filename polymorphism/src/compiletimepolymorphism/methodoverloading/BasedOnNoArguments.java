package compiletimepolymorphism.methodoverloading;

public class BasedOnNoArguments 
{
       public static void main(String[]args)
		{
			add(10,20,30);
			add(10,4);
		}
		  
		  public static void add(int a)
		  {
			  System.out.println("FROM ADD (INT A)");
		  }
		  public static void add(int a,int b)
		  {
			  System.out.println("FROM ADD (INT A,INT B)");
		  }
		  public static void add(int a,int b,int c)
		  {
			  System.out.println("FROM ADD (INT A,INT B,INT C)");
		  }

	}




