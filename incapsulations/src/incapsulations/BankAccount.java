package incapsulations;

public class BankAccount
{
	private String accountHolderName;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolderName,long accountNumber, double balance) 
    {
    	this.accountHolderName=accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
      public void setname(String newName)
      {
    	  this.accountHolderName=newName;
      }
       public String getname()
       {
    	   return accountHolderName;
    			   
       }

    public long getAccountNumber() 
    {
        return accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        if (amount <= balance) 
        {
            balance -= amount;
        } else 
        {
            System.out.println("Insufficient balance!");
        }
    }
      public void getAccountDetails()
      {
    	  System.out.println("ACCOUNT HOLDER NAME=  "+this.accountHolderName);
    	  System.out.println("ACCOUNT NUMBER= "+ this.accountNumber);
    	  System.out.println("ACCOUNT BALANCE= "+ this.balance);
      }
}

