package runtimepolymorphism.methodoveriding;

public class Driver {

	public static void main(String[] args)
	{
		  Parent p1=new Parent();
	    		 p1.m1();//FROM PARENT CLASS OF M1()
         
	       Child ch1=new Child();
            ch1.m1();//FROM CHILD CLASS OF M1()
            
           Parent p2=ch1;
           p2.m1();//FROM CHILD CLASS OF M1()
           
           Child ch2=(Child)ch1;
           ch2.m1();//FROM CHILD CLASS OF M1()
           
           Parent p3=new Child();
           p3.m1();//FROM CHILD CLASS M1()
	}


	}


