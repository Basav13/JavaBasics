class A
{
	
	
	void func()
	{
		System.out.println("A");
	}
	
	protected Number take()
	{
		return 4;
	}
}

class B extends A
{

	void func()
	{
		System.out.println("B");
	}
	protected Number take()
	{
		return 4;
	}
}

class C extends B
{
	
	void func()
	{
		System.out.println("C");
	}
}

class D extends C
{
	void func()
	{
		System.out.println("D");
	}
	void func2()
	{
		func();
		((C)this).func();
		((B)this).func();
		((A)this).func();
	}
	
}
public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new D().func2();
	}

}
