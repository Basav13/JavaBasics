
public class MyDaemonThread implements Runnable {
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
			System.out.println("It's Daemon!");
		else
			System.out.println("It's normal Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDaemonThread dmn = new MyDaemonThread();
		Thread trd1 = new Thread(dmn);
		MyDaemonThread nrm = new MyDaemonThread();
		Thread trd2 = new Thread(nrm);
		trd1.setDaemon(true);
		trd1.start();
		trd2.start();

	}

}
