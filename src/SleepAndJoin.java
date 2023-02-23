
class MyThread extends Thread
{
	int id = 0;
	
	public MyThread(int id)
	{
		this.id = id;
	}
	public void run()
	{
		int count = 0;
		while(count < 4)
		{
			System.out.println("This is thread : "+this.id);
			try
			{
				Thread.sleep(1000);
				count++;
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class SleepAndJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread trd1 = new MyThread(1);
		trd1.start();
		MyThread trd2 = new MyThread(2);
		MyThread trd3 = new MyThread(3);
		trd2.start();
		trd3.start();
		
		try
		{
			trd1.join();
			System.out.println("trd1 joined");
			trd2.join();
			System.out.println("trd2 joined");
			trd3.join();
			System.out.println("trd3 joined");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Program ended");
		

	}

}
