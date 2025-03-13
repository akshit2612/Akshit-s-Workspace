import java.util.*;
class Account
{
	// visibility mode / access specifier / scope
	private int accno;
	private String name;
	private float balance;
	
	Scanner sc = new Scanner(System.in);

	public void input()
	{
	System.out.println("Enter Account No. ");
	accno = sc.nextInt();
	sc.nextLine(); // It removes the Enter key from //input buffer before taking string input for name
	System.out.println("Enter Name : ");
	name = sc.nextLine();
	System.out.println("Enter Initial Deposit : ");
	balance = sc.nextFloat();
	}

	public void show()
	{
	System.out.println("Account No. is "+accno);
	System.out.println("Name is "+name);
	System.out.println("Balance in Account is  "+ balance);
	}
	public void deposit()
	{
	int amt;
	System.out.println("Enter Amount to Deposit : ");
	amt = sc.nextInt();
	balance += amt;
	System.out.println("Updated Balance is "+balance);
	}

public void withdraw()
	{
	int amt;
	System.out.println("Enter Amount to Withdraw : ");
	amt = sc.nextInt();
	if(amt <= balance)
    {
        balance -= amt;
    }
		
	else
    {
        System.out.println("Insufficient Balance");
        System.out.println("Updated Balance is "+balance);
    }
		
	}


}
class Bank
{
	public static void main(String args[])
	{
		
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		int ch;
		a.input();
		do
		{
		System.out.println("Press 1 - Deposit");
	System.out.println("Press 2 - Withdraw");
System.out.println("Press 3 - Display");
System.out.println("Press 4 - Exit");
ch = sc.nextInt();
if(ch == 3)
{
    a.show();
}
		
else if(ch == 1)
{
    a.deposit();
}
		
else if(ch == 2)
{
    a.withdraw();
}
		
else
	break;

}while(ch!=4);
	}
}