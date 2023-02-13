import java.util.*;


public class TypesOfMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------HashMap-----");
		Map<Integer,String> hmp = new HashMap<Integer,String>();
		hmp.put(1,"Pathaan");
		hmp.put(2,"Shehzada");
		hmp.put(3, "Action Hero");
		
		for(Map.Entry<Integer,String> m : hmp.entrySet())
		{
			System.out.print(m.getKey()+":");
			System.out.println(m.getValue());
		}
		System.out.println("-------LinkedHashMap------");
		LinkedHashMap<Integer,String> lkp = new LinkedHashMap<Integer,String>();
		lkp.put(1 , "ABC");
		lkp.put(2,"DEF");
		lkp.put(null,"DEF");
		lkp.put(null, null);
		System.out.println(lkp);
		
		System.out.println("------Sorted Maps------");
		SortedMap<String,Integer> smp = new TreeMap<String,Integer>(new Comparator<String>() {
				public int compare(String a , String b) 
				{
					return b.compareTo(a);
				}
		});
		smp.put("Buggati", 1);
		smp.put("Aston Martin", 2);
		smp.put("Jaguar", 3);
		
		Iterator<?> it = smp.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Integer> m = (Map.Entry<String, Integer>)it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
