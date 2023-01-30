interface Test
{
	String str = "JavaDev";
	void func();
	
	interface Nested
	{
		void show();
	}
}

class Example implements Test,Test.Nested
{
	@Override public void func()
	{
		//Test.str = "Java"; //All the variables in Interfaces are final and can't be changed
		System.out.println("For implementing Nested Interface you need to implement Test.Nested");
	}
	@Override public void show()
	{
		System.out.println("You are in Nested Interface");
	}
}
public class NestedInterface {

	public static void main(String[] args) {
		Example obj = new Example();
		obj.func();
		obj.show();

	}

}
