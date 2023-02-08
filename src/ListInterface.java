import java.util.*;
public class ListInterface {

	public static void main(String[] args) {
		List<Integer> st = new Stack<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		System.out.println(st);
		st.remove(1);
		System.out.println(st);
		System.out.println(st.get(1));
		
		List<Integer> vt = new Vector<Integer>();
		for(int i = 0 ; i < 5 ; i++)
		{
			vt.add(i+1);
		}
		for(int i = 0 ; i < vt.size(); i++)
		{
			System.out.print(vt.get(i)+" ");
		}
		System.out.println();
		
		List<Integer> lt = new LinkedList<Integer>();
		for(int i = 0 ; i < 5 ; i++)
		{
			lt.add(i+6);
		}
		Iterator<Integer> it = lt.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
