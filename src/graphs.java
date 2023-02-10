import java.util.*;
public class graphs {
	
	static void  addEle(ArrayList<ArrayList<Integer>> adj , int i , int j)
	{
		adj.get(i).add(j);
		adj.get(j).add(i);
	}
	static ArrayList<Integer> bfs(int V , ArrayList<ArrayList<Integer>> adj)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		boolean vis[] = new boolean[V];
		vis[0] = true;
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		
		while(!q.isEmpty())
		{
			int node = q.peek();
			q.poll();
			ans.add(node);
			for(Integer it : adj.get(node))
			{
				if(vis[it] == false)
				{
					q.add(it);
					vis[it] = true;
				}
			}
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0 ; i < 5 ; i++)
		{
			adj.add(new ArrayList<>());
		}
		addEle(adj,0,1);
		addEle(adj,0,4);
		addEle(adj,1,2);
		addEle(adj,1,3);
		
		ArrayList<Integer> display = bfs(5,adj);
		System.out.println(display);
		
	}

}
