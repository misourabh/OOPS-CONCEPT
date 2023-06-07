package compiletimepolymorphism.methodoverloading;

public class OverLoadingMainMethod {

	public static void main(String[] args) 
	{
       System.out.println("FROM MAIN (STRING[]ARGS)");

	}
	 public static void main(int a)
	 {
		 System.out.println("FROM MAIN (INT A) ");
	 }
	 public static void main()
	 {
		 System.out.println("FROM MAIN()NO ARGUMENTS");
	 }

}



