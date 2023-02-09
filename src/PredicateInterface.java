import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class User
{
	String name,role;
	User(String name , String role)
	{
		this.name = name;
		this.role = role;
	}
	String getRole()
	{
		return this.role;
	}
	String getName()
	{
		return this.name;
	}
	public String toString()
	{
		return "UserName : "+name+"-> Role : "+role;
	}
}

public class PredicateInterface {

	public static void main(String[] args) {
		Predicate<String> starts = str -> str.startsWith("B");
		Predicate<String> hasLengthOf = str -> str.length() == 5;
		boolean result = starts.and(hasLengthOf).test("Basav");
		System.out.println(result);
		
		List<User> list = new ArrayList<User>();
		list.add(new User("Basav","admin"));
		list.add(new User("Snakalp","member"));
		list.add(new User("Aryan","admin"));
		
		List admins = list.stream().filter(user -> user.getRole().equals("admin")).collect(Collectors.toList());
		System.out.println(admins);
		
	}

}
