import java.util.*;

class Dictionary implements Comparable<Dictionary> 
{
	String name;
	
	Dictionary(String name)
	{
		this.name = name;
	}
	
	public int compareTo(Dictionary b)
	{
		return this.name.compareTo(b.name);
	}
	
}
public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dictionary> list = new ArrayList<Dictionary>();
		list.add(new Dictionary("Orange"));
		list.add(new Dictionary("Bananas"));
		list.add(new Dictionary("Apples"));
		list.add(new Dictionary("WaterMelon"));
		list.add(new Dictionary("Guava"));
		for(int i = 0 ; i < list.size(); i++)
		{
			System.out.print(list.get(i).name+" ");
		}
		System.out.println();
		Collections.sort(list);
		for(int i = 0 ; i < list.size(); i++)
		{
			System.out.print(list.get(i).name+" ");
		}

	}

}
