class Bank
{
	int amount;
	Bank(int amount)
	{
		this.amount = amount;
	}
	synchronized void withdraw(int amt)
	{
		System.out.println("Withdrawal in process..");
		if(amt > amount)
		{
			System.out.println("Insuficient balance , waiting for deposit");
			try
			{
				wait();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		this.amount -= amt;
		System.out.println(amt+" Withdrawal Complete!");
		System.out.println("Current balance : "+this.amount);
	}
	
	synchronized void deposit(int amt)
	{
		System.out.println("Deposit in progress..");
		this.amount += amt;
		System.out.println(amt+" Deposited!");
		System.out.println("Current balance : "+this.amount);
		notify();
	}
	
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(20000);
		new Thread() {
			public void run()
			{
				b.withdraw(25000);
			}
		}.start();
		new Thread() {
			public void run()
			{
				b.deposit(10000);
			}
		}.start();

	}

}
