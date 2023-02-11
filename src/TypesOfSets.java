import java.util.*;

class Helper implements Comparator<String>
{
	@Override public int compare(String s1 , String s2)
	{
		return s2.compareTo(s1);
	}
}

public class TypesOfSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet
		System.out.println("------HashSet------");
		Set<Integer> hst = new HashSet<Integer>();
		hst.add(2);
		hst.add(3);
		hst.add(5);
		hst.add(2);
		System.out.println(hst);
		hst.add(4);
		hst.remove(2);
		for(Integer val : hst)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println("------LinkedHashSet------");
		
		//LinkedHashSet
		Set<String> lst = new LinkedHashSet<String>();
		lst.add("Radhe");
		lst.add("Tamanna");
		lst.add("Arghya");
		Iterator<String> it = lst.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("------NavigableHashSet------");
		//NavigableSet
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		Collections.addAll(ns,3,4,1,2,5,7,6,8,9);
		System.out.println(ns);
		NavigableSet<Integer> rev = ns.descendingSet();
		System.out.println(rev);
		NavigableSet<Integer> threeMore = ns.tailSet(3,true);
		System.out.println(threeMore);
		System.out.println(ns.lower(4));
		System.out.println(ns.higher(7));
		System.out.println(ns.floor(5));
		ns.pollFirst();
		ns.pollLast();
		System.out.println(ns);
		ns.remove(5);
		System.out.println(ns);
		System.out.println(ns.contains(6));
		
		System.out.println("TreeSet with custo comparator"); 
		
		//TreeSet
		Set<String> tst = new TreeSet<String>(new Helper());
		Collections.addAll(tst, "Basav","Khopa","Next","Biscuit","Buppy");
		System.out.println(tst);
	}

}
