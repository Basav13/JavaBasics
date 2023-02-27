class SignalTest
{
	public void tester(String name)
	{
		System.out.println("Incoming signal "+name);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Signal Recieved");
	}
}

class SignalThread extends Thread
{
	private String name;
	SignalTest st;
	
	SignalThread(String name , SignalTest st)
	{
		this.name = name;
		this.st = st;
	}
	
	public void run()
	{
		synchronized(st)
		{
			st.tester(name);
		}
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignalTest sgt = new SignalTest();
		SignalThread trd1 = new SignalThread("Airtel",sgt);
		SignalThread trd2 = new SignalThread("Jio",sgt);
		trd1.start();
		trd2.start();
		try
		{
			trd1.join();
			trd2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}
