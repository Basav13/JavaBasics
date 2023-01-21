import java.util.*;
public class TwoSum {
	
	public static int[] twoSum(int[] arr , int target)
	{
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		int[] res = new int[2];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			mp.put(arr[i],i);
			if(mp.containsKey(target - arr[i]))
			{
				res[1] = i;
				res[0] = mp.get(target-arr[i]);
				return res;
			}

		}
		return res;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,1,5};
		int[] ans = twoSum(arr,9);
		for(int val : ans)
		{
			System.out.println(val);
		}
		
	}

}
