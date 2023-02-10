import java.util.*;

public class LinkyList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("previous");
		list.add("Value");
		list.add("next");
		//System.out.println(list);
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"->");
		}
		System.out.println();
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}

}
