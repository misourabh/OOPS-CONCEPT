package inheritence.hierarichicalinhertitence;

public class Ola 
{
	String Starting;
	String Destination;
	
	Ola(String Start,String end)
	{
		this.Starting=Start;
		this.Destination=end;
	}
}
        class Bike extends Ola
    {  
	   double price=5;
      
	   Bike(String Start, String end) {
		super(Start, end);
	}
	    public void getBikeAttributes()
	    {
	    	System.out.println("STARTING POINT= "+ this.Starting);
	    	System.out.println("DESTINATION POINT= "+ this.Destination);
	    	System.out.println("COST PER KM "+ this.price);
	    }
    }
        class Auto extends Ola
        {
        	double price=10;
        	
        	Auto(String Start, String end)
        	{
				super(Start, end);
			}
        	public void getAutoAttributes()
    	    {
    	    	System.out.println("STARTING POINT= "+ this.Starting);
    	    	System.out.println("DESTINATION POINT= "+ this.Destination);
    	    	System.out.println("COST PER KM= "+ this.price);
    	    }
       }

