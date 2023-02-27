class Dhaage implements Runnable
{
	private int id;
	Dhaage(int id)
	{
		this.id = id;
	}
	public void run()
	{
		System.out.println("This is dhaaga "+this.id);
	}
	
}

public class PriorityOfThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dhaage dg = new Dhaage(1);
		Thread trd1 = new Thread(dg);
		Dhaage dg2 = new Dhaage(2);
		Dhaage dg3 = new Dhaage(3);
		Thread trd2 = new Thread(dg2);
		Thread trd3 = new Thread(dg3);
		System.out.println("Before setting priority");
		System.out.println("trd1 : "+trd1.getPriority());
		System.out.println("trd2 : "+trd2.getPriority());
		System.out.println("trd3 : "+trd3.getPriority());
		trd1.setPriority(4);
		trd2.setPriority(6);
		trd3.setPriority(8);
		System.out.println("After setting priority");
		System.out.println("trd1 : "+trd1.getPriority());
		System.out.println("trd2 : "+trd2.getPriority());
		System.out.println("trd3 : "+trd3.getPriority());
		System.out.println("CURRENT RUNNING THREAD : "+Thread.currentThread().getName()+" AND IT'S PRIORITY IS : "+Thread.currentThread().getPriority());
		

	}

}
