
enum Employee
{
	HOURLY,
	BASE,
	FIXED,
	OVERTIME;
}

class PayRollOperations
{
	Employee emp;
	PayRollOperations(Employee emp)
	{
		this.emp = emp;
	}
	
	void func()
	{
		switch(emp)
		{
		case HOURLY:
			System.out.println("Hourly");
			break;
		case BASE:
			System.out.println("Base");
			break;
		case FIXED:
			System.out.println("Fixed");
			break;
		case OVERTIME:
			System.out.println("Overtime");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}

public class EnumPayroll {

	public static void main(String[] args) {
		String str = "BASE";
		PayRollOperations obj = new PayRollOperations(Employee.valueOf(str));
		obj.func();

	}

}
