import java.util.*;

class Procedure
{
	public List<List<Integer>> func(int[] num , int target)
	{
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(num == null || num.length == 0)
			return ans;
		
		Arrays.sort(num);
		int n = num.length;
		for(int i = 0 ; i < n ; i++)
		{
			int target_3 = target - num[i];
			for(int j = i+1 ; j < n ; j++)
			{
				int target_2 = target_3 - num[j];
				int front = j+1;
				int back = n-1;
				while(front < back)
				{
					if(num[front] + num[back] < target_2)
						front++;
					else if(num[front] + num[back] > target_2)
						back--;
					else
					{
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[j]);
						temp.add(num[front]);
						temp.add(num[back]);
						ans.add(temp);
						
						while(front < back && num[front] == temp.get(2))
							++front;
						while(front < back && num[back] == temp.get(3))
							--back;
						
					}
				}
				while(j+1  < n && num[j+1] == num[j])
					++j;
			}
			while(i+1 < n && num[i+1] == num[i])
				++i;
		}
		
		return ans;
		
	}
}

public class FourSum {

	public static void main(String[] args) {
		int[] arr = {1,0,-1,0,-2,2};
		int target = 0;
		Procedure obj = new Procedure();
		List<List<Integer>> res = obj.func(arr, target);
		for(int i = 0 ; i < res.size() ; i++)
		{
			for(int j = 0 ; j < res.get(i).size(); j++)
			{
				System.out.print(res.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
