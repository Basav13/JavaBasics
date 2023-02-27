
class Table
{
	synchronized void getTable(int n)
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread
{
	Table t;
	
	MyThread1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.getTable(2);
	}
}

class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.getTable(3);
	}
}

public class BasicSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table tb = new Table();
		MyThread1 trd1 = new MyThread1(tb);
		MyThread2 trd2 = new MyThread2(tb);
		trd1.start();
		trd2.start();
	}

}
