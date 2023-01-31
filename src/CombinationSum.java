import java.util.*;
class Recursion
{
	void rec(int i , int[] candidates , int target , List<List<Integer>> ans , List<Integer> temp)
	{
		//ArrayList<Stack<Integer>> ls = new ArrayList<Stack<Integer>>();
		
		if(i == candidates.length)
		{
			if(target == 0)
				ans.add(new ArrayList<>(temp)); 
			return;
		}
		if(candidates[i] <= target)
		{
			temp.add(candidates[i]);
			rec(i,candidates,target-candidates[i],ans,temp);
			temp.remove(temp.size()-1);
		}
		rec(i+1,candidates,target,ans,temp);
		
		
	}
	
	List<List<Integer>> func(int[] candidates , int target)
	{
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		
		rec(0,candidates,target,ans,temp);
		
		return ans;
	}
}

public class CombinationSum {

	public static void main(String[] args) {
		int[] candidates = {2,3,5};
		int target = 8;
		
		Recursion obj = new Recursion();
		List<List<Integer>> res = obj.func(candidates, target);
		for(int i = 0 ; i < res.size(); i++)
		{
			for(int val : res.get(i))
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

}
