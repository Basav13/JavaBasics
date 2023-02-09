import java.lang.Cloneable;

class CloneCon implements Cloneable
{
	int a , b;
	CloneCon(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
	
	@Override public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class CloningConcept {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneCon obj1 = new CloneCon(2,3);
		CloneCon obj2 = obj1;
		obj2.a = 5;
		System.out.println(obj1.a+" "+obj1.b);
		CloneCon obj3 = (CloneCon)obj1.clone();
		obj3.a = 6;
		System.out.println(obj2.a+" "+obj2.b);
		System.out.println(obj3.a+" "+obj3.b);
		
	}

}
