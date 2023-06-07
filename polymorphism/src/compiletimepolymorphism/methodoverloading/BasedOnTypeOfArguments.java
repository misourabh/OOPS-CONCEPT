package compiletimepolymorphism.methodoverloading;

public class BasedOnTypeOfArguments 
{
      public static void main(String[]args)
      {
    	  add(10,20);
    	  add(12,34.23f);
      }
        public static void add(int a,int b)
        {
        	System.out.println("FROM ADD ( INT ,INT )");
        }
         public static void add(int a,float b)
        {
        	System.out.println("FROM ADD ( INT ,FLOAT )");
        }
         public static void add(int a,char b)
         {
         	System.out.println("FROM ADD ( INT ,CHAR )");
         }
}
