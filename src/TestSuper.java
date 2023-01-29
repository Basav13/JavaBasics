class A
{
	
	A()
	{
		System.out.println("A");
	}
	
	A(int x)
	{
		System.out.println("nsc");
	}
}

class B extends A
{
	B()
	{
		System.out.println("B");
	}
	B(int x)
	{
		
		System.out.println("bjj");
	}
}

class C extends B
{
	C(int y)
	{
		System.out.println("super constructor");
	}
}
public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C(3);
	}

}
