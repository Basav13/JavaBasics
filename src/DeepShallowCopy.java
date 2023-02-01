
class Testify
{
	int x;
	Testify(int x)
	{
		this.x = x;
	}
}

public class DeepShallowCopy {

	public static void main(String[] args) {
		Testify obj1 = new Testify(10);
		Testify obj2 = obj1;// same reference
		System.out.println(obj1.x);
		System.out.println("After shallow cloning");
		obj2.x = 5;
		System.out.println(obj1.x);
		Testify obj3 = new Testify(7);//new reference
		System.out.println(obj3.x);
		System.out.println("Deep copy");
		obj3.x = 11;
		System.out.println(obj3.x);
		String str1 = new String("Let's clone it!");
		String str2 = str1;
		System.out.println("str1 : "+str1+" "+str1.hashCode());
		System.out.println("str2 : "+str2+" "+str2.hashCode());
		System.out.println("...");
		str2 = "Changing my reference";
		System.out.println("str1 : "+str1+" "+str1.hashCode());
		System.out.println("str2 : "+str2+" "+str2.hashCode());

	}

}
