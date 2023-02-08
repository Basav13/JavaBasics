import java.util.Scanner;

interface Payroll
{
	void operation();
	
}

class EmployeeDetails
{
	String name,email,type;
	static int hours,sales;
	public void getEmployee()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter name : ");
		this.name = scn.nextLine();
		System.out.println("Enter email : ");
		this.email = scn.nextLine();
		System.out.println("Enter type : ");
		this.type = scn.nextLine();
		if(this.type.equals("hourly"))
		{
			System.out.println("Enter number of hours : ");
			hours = scn.nextInt();
		}
		if(this.type.equals("commission") || this.type.equals("baseCom"))
		{
			System.out.println("Enter amount of sales : ");
			sales = scn.nextInt();
		}
	}
}

class Salaried implements Payroll
{
	
	@Override public void operation()
	{
		System.out.println("15000 credited!");
	}
}

class HourlyEmployees implements Payroll
{
	@Override public void operation()
	{
		if(EmployeeDetails.hours > 40)
		{
			System.out.println(200*40 + ((EmployeeDetails.hours-40)*1.5*200));
		}
		else
		{
			System.out.println(200*EmployeeDetails.hours);
		}
	}
}

class CommissionEmployees implements Payroll
{
	@Override public void operation()
	{
		System.out.println(0.15*EmployeeDetails.sales);
	}
}

class BaseSalaryComm implements Payroll
{
	@Override public void operation()
	{
		System.out.println(5000 + 0.1*5000 + .12*EmployeeDetails.sales);
	}
}

class PayrollFactory
{
	public Payroll implementPayroll(String type)
	{
		if(type == null || type.isEmpty())
			return null;
		switch(type)
		{
		case "salaried":
			return new Salaried();
		case "hourly":
			return new HourlyEmployees();
		case "commission":
			return new CommissionEmployees();
		case "baseCom":
			return new BaseSalaryComm();
		default:
			throw new IllegalArgumentException("Invalid Type : "+type);
		
		}
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.getEmployee();
		PayrollFactory fac = new PayrollFactory();
		Payroll payroll = fac.implementPayroll(obj.type);
		payroll.operation();

	}

}
