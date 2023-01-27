
interface TwoDimensional
{
	public double area();
	public double perimeter();
}

interface ThreeDimensional 
{
	public double surfaceArea();
	public double volume();
	
}

class Square implements TwoDimensional
{
	private int side;
	
	Square(int side)
	{
		this.side = side;
	}
	
	@Override public double area()	
	{
		return side*side;
	}
	
	@Override public double perimeter()
	{
		return 4*side;
	}
}

class Cylinder implements ThreeDimensional
{
	private int radius,height;
	private double pi = 3.14;
	
	Cylinder(int radius , int height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	@Override public double surfaceArea()
	{
		return 2*pi*radius*height + 2*pi*radius*radius;
	}
	
	@Override public double volume()
	{
		return pi*radius*radius*height;
	}
}

public class InterfacesJava {

	public static void main(String[] args) {
		Square s = new Square(5);
		System.out.println("--Sqaure--");
		System.out.println("Perimeter : "+s.perimeter());
		System.out.println("Area : "+s.area());
		Cylinder c = new Cylinder(5,3);
		System.out.println("--Cylinder--");
		System.out.println("Surface Area : "+c.surfaceArea());
		System.out.println("Volume : "+c.volume());

	}

}
