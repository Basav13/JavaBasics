abstract class Figure
{
	String name = new String("");
	Figure(String name)
	{
		this.name = name;
	}
	abstract public double perimeter();
	abstract public double area();
	public void destroy()
	{
		System.out.println(name+" is dstroyed");
	}
}

class Rectangle extends Figure
{
	private int length;
	private int breadth;
	
	Rectangle(int length , int breadth , String name)
	{
		super(name);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override public double perimeter()
	{
		return 2*(length+breadth);
	}
	@Override public double area()
	{
		return length*breadth;
	}
}

class Triangle extends Figure
{
	private int base;
	private int side1,side2;
	private int height;
	
	Triangle(int base , int side1 , int side2 , int height , String name)
	{
		super(name);
		this.base =base;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}
	
	
	@Override public double perimeter()
	{
		return base + side1 + side2;
	}
	@Override public double area()
	{
		return (base*height)*(0.5);
	}
}

public class AbstractionJava {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4,"Rectangle");
		System.out.println(r.name);
		System.out.println("Area : "+r.area());
		System.out.println("Perimeter : "+r.perimeter());
		r.destroy();
		Triangle t = new Triangle(4,3,5,2,"Triangle");
		System.out.println(t.name);
		System.out.println("Area : "+t.area());
		System.out.println("Perimeter : "+t.perimeter());
		t.destroy();

	}

}
