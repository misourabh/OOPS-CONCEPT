package compiletimepolymorphism.variableshadowing;

class Driver1
{
	public static void main(String[]args)
	{
		C c1=new C();
		System.out.println(c1.a);// 30
		
		A a1=c1;
		System.out.println(a1.a); //UPCASTING DONE 10
		
		B b1=(B)a1;
		System.out.println(b1.a);//DOWNCASTING DONE 20
		
	
;
	}
}


