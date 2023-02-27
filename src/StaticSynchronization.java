class Repeater
{
	synchronized static void repeat(int r , int n)
	{
		//synchronized(Repeater.class)
		for(int i = 1 ; i <= r ; i++)
		{
			System.out.println(n);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}


public class StaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread trd1 = new Thread() {
			public void run()
			{
				Repeater.repeat(5,2);
			}
		};
		Thread trd2 = new Thread() {
			public void run()
			{
				Repeater.repeat(4,3);	
			}
		};
		Thread trd3 = new Thread() {
			public void run()
			{
				Repeater.repeat(3,4);
			}
		};
		trd1.start();
		trd2.start();
		trd3.start();
		
		try
		{
			trd1.join();
			trd2.join();
			trd3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Program Ended");

	}

}
