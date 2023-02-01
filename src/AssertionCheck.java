
public class AssertionCheck {

	public static void main(String[] args) {
		int age = 14;
		assert age > 18 : "Can't drive1";//Exception occurs if age is < 18.
		System.out.println(age);

	}

}
