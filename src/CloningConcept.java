import java.lang.Cloneable;

class TestDeep
{
	int x,y;
}

class CloneCon implements Cloneable
{
	int a , b;
	TestDeep cl = new TestDeep();
	CloneCon(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
	
	@Override public Object clone() throws CloneNotSupportedException
	{
		//return super.clone();
		CloneCon t = (CloneCon)super.clone();
		t.cl = new TestDeep();
		t.cl.x = cl.x;
		t.cl.y = cl.y;
		return t;
	}
}

public class CloningConcept {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneCon obj1 = new CloneCon(2,3);
		obj1.cl.x = 9;
		obj1.cl.y = 8;
		CloneCon obj2 = obj1;
		obj2.a = 5;
		obj2.cl.y = 9;
		System.out.println(obj1.a+" "+obj1.b+" "+obj1.cl.x+" "+obj1.cl.y);
		CloneCon obj3 = (CloneCon)obj1.clone();
		obj3.a = 6;
		obj3.cl.y = 11;
		System.out.println(obj2.a+" "+obj2.b+" "+obj2.cl.x+" "+obj2.cl.y);
		System.out.println(obj3.a+" "+obj3.b+" "+obj3.cl.x+" "+obj3.cl.y);
		
	}

}
