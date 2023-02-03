
public class ExceptionHanding {
	
	static void validVoting(int age)
	{
		if(age >= 18)
		{
			System.out.println("Can vote");
		}
		else
		{
			throw new IllegalArgumentException("Not eligibe for voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		int b = 0;
		 try
		 {
			 System.out.println(a/2);
			
		 }
		 catch(ArithmeticException e)
		 {
			 //e.printStackTrace();
			// System.out.println(e.toString());
			 System.out.println(e.getMessage());
		 }
		 finally
		 {
			 System.out.println("Finally block message");
		 }
		 validVoting(a);
	}

}
