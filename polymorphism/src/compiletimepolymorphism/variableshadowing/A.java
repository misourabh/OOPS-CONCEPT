package compiletimepolymorphism.variableshadowing;

 class A
{
   int a=10;
}
  class B extends A
  {
	  int a=20;
	  
  }
   class C extends B
   {
	   int a=30;
   }
   class D extends C
   {
	   int a=40;
   }
     class E extends D
     {
    	 int a=50;
     }
      
      