package abstraction;

 abstract public class Phone
{
	abstract public void camera();
	abstract public void androidVersion();
	abstract public void ram();
	abstract public void price();
}
    class OnePlus extends Phone
   {

		@Override
		public void camera() {
			System.out.println("ONEPLUS MOBILE HAS 108PX CAMERA RANGE");
			
		}

		@Override
		public void androidVersion() {
         System.out.println("THE ANDROID VERSION OF ONEPLUS IS 10.00.10. ");			
		}

		@Override
		public void ram() {
           System.out.println("THE RAM FOR ONE PLUS MOBILE IS FROM 6GB TO 12 GB");			
		}

		@Override
		public void price() {
         System.out.println("THE PRICE FOR MOBILE IS FROM 30K TO 50K");			
		}
	   
   }
        
    
    
