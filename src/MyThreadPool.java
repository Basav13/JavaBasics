import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TPThread implements Runnable
{
	private String str;
	
	TPThread(String str)
	{
		this.str = str;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"Started "+this.str);
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"Ended "+this.str);
	}
}

public class MyThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i = 0 ; i < 10 ; i++)
		{
			Runnable rn = new TPThread(""+i);
			exec.execute(rn);
		}
		exec.shutdown();
		while(!exec.isTerminated())
		{
			
		}
		System.out.println("Program ended");

	}

}
