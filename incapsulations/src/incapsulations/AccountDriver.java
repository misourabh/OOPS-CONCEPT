package incapsulations;

public class AccountDriver {
	public static void main(String[]args)
	{
		BankAccount ba=new BankAccount("SOURABH DHOTRE",7058981413L,15000.00);
		ba.getAccountDetails();
		ba.setname("lokesh ");
		System.out.println("I AM SETTING NEW NAME THAT IS= "+ba.getname());
		ba.withdraw(1500);
		System.out.println("I AM WITHRAW 1500 FROM MY ACCOUNT & BALANCE= "+ba.getBalance());
		ba.deposit(1000);
		System.out.println("I AM DEPOSITING 1000 TO MY ACCOUNT & BALANCE= "+ba.getBalance());
		
		
		
	}

}
