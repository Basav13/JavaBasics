import java.util.*;

public class CollectionsMethods {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(5);
		arr.add(1);
		Collections.addAll(arr,6,4,7,2,8,9);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		System.out.println(Collections.binarySearch(arr,5));
		System.out.println(Collections.binarySearch(arr,0));
		List<Integer> lst = new ArrayList<>();
		for(int i = 0 ; i < 10 ; i++)
		{
			lst.add(i,0);
		}
		System.out.println(Collections.frequency(lst, 0));
		Collections.copy(lst, arr);
		System.out.println(lst);
		System.out.println(Collections.disjoint(arr, lst));
	}

}
