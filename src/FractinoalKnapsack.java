import java.util.*;

class Item
{
	int weight;
	int value;
	Item(int x , int y)
	{
		this.weight = x;
		this.value = y;
	}
}

class Cmp implements Comparator<Item>
{
	@Override public int compare(Item a , Item b)
	{
		double r1 = (double)a.value / (double)a.weight;
		double r2 = (double)b.value / (double)b.weight;
		if(r1 < r2)
			return 1;
		else if(r1 > r2)
			return -1;
		else
			return 0;
	}
}

class Func
{
	double fracKnap(int W , Item[] arr , int n)
	{
		Arrays.sort(arr,new Cmp());
		int curr = 0;
		double ans = 0;
		for(int i = 0 ; i < n ; i++)
		{
			if(curr + arr[i].weight <= W)
			{
				curr += arr[i].weight;
				ans += arr[i].value;
			}
			else
			{
				int rem = W - curr;
				ans += ((double)arr[i].value / (double)arr[i].weight)*(double)rem;
				break;
			}
		}
		return ans;
	}
}
public class FractinoalKnapsack {

	public static void main(String[] args) {
		int n = 3 , W = 50;
		Item[] arr = new Item[n];
		arr[0] = new Item(20,100);
		arr[1] = new Item(10,60);
		arr[2] = new Item(30,120);
		
		Func obj = new Func();
		double ans = obj.fracKnap(W, arr, n);
		System.out.println(ans);

	}

}
