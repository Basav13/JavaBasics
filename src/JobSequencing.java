import java.util.*;

class Job {
	int id,profit,deadline;
	Job(int a , int b , int c)
	{
		this.id = a;
		this.deadline = b;
		this.profit = c;
	}
}

class MyComp implements Comparator<Job>
{
	public int compare(Job a , Job b)
	{
		return  b.profit - a.profit;
	}
}

class Solve
{
	int[] jobScheduling(Job arr[] , int n)
	{
		Arrays.sort(arr,new MyComp());

		int maxi = 0;
		for(int i = 0 ; i < n ; i++)
		{
			if(arr[i].deadline  >maxi)
			{
				maxi = arr[i].deadline;
			}
		}
		int[] slot = new int[maxi+1];
		for(int i = 0 ; i <= maxi ; i++)
		{
			slot[i] = -1;
		}
		int count = 0 , total_profit = 0;
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = arr[i].deadline ; j > 0 ; j--)
			{
				if(slot[j] == -1)
				{
					slot[j] = i;
					count++;
					total_profit += arr[i].profit;
					break;
				}
			}
		}
		int[] ans = new int[2];
		ans[0] = count;
		ans[1] = total_profit;
		return ans;
		
	}
	
}
public class JobSequencing {
	
	public static void main(String[] args) {
		Job[] arr = new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);
        
        Solve ob = new Solve();
        int[] res = ob.jobScheduling(arr,4);
        System.out.println(res[0]+" "+res[1]);

	}

}
