
public class UserDefinedException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int bal[] = {5000,7742,6789,4985,8940};
	static String[] names = {"Kabir","Pathaan","Tiger","Rubina","Zoya"};
	UserDefinedException()
	{
		
	}
	UserDefinedException(String str)
	{
		super(str);
	}
	
	public static void main(String[] args) {
		try
		{
			for(int i = 0 ; i < bal.length ; i++)
			{
				System.out.println(names[i]+" "+bal[i]);
				
				if(bal[i] < 5000)
				{
					UserDefinedException e = new UserDefinedException("Low Balance");
					throw e;
				}
				
			}
		}
		catch(UserDefinedException e)
		{
			e.printStackTrace();
		}

	}

}
