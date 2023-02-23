	
class CreateDiffThread implements Runnable
{
	public void run()
	{
		System.out.println("Created through runnable");
	}
}

public class CreatingThreads extends Thread{
	public void run()
	{
		System.out.println("Thread Created");
	}
	
	public static void main(String[] args)
	{
		CreatingThreads trd = new CreatingThreads();
		trd.start();
		CreateDiffThread crt = new CreateDiffThread();
		Thread trd2 = new Thread(crt);
		trd2.start();
		Thread trd3 = new Thread("This is direct thread");
		trd3.start();
		System.out.println(trd3.getName());
		Thread trd4 = new Thread() {
			public void run()
			{
				System.out.println("Thread Created in a line");
			}
		};
		trd4.start();
	}

}
