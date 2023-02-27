
public class GroupingThreads implements Runnable {
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i = 0 ; i < 1000 ; i++)
		{
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println("Ended");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupingThreads trds = new GroupingThreads();
		ThreadGroup gp1 = new ThreadGroup("Group I");
		ThreadGroup gp2 = new ThreadGroup(gp1,"Group II");
		Thread trd1 = new Thread(gp1,trds,"First");
		Thread trd2 = new Thread(gp1,trds,"Second");
		Thread trd3 = new Thread(gp1,trds,"Third");
		
		trd1.start();
		trd2.start();
		trd3.start();
		
		System.out.println("Threads active : "+gp1.activeCount());
		System.out.println("Thread Groups active : "+gp1.activeGroupCount());
		
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
		
		
		System.out.println("Thread Group Name : "+gp1.getName());
		gp1.list();
	}

}
