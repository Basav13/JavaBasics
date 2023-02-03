
class Throwingtest
{
	static int[] arr = {1,2,3,4,5};
	Throwingtest()
	{
		
	}
	static void func() throws ArrayIndexOutOfBoundsException
	{
		System.out.println(arr[5]);
	}
}

public class ThrowsTest {

	public static void main(String[] args) {
		//Throwingtest obj = new Throwingtest();
		try
		{
			Throwingtest.func();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e.toString());
		}

	}

}


