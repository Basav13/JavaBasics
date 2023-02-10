import java.util.*;

public class Kataar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		System.out.println(q);
		System.out.println("Removes Element : "+q.remove());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println("Removed Element : "+q.poll());
		System.out.println(q);
		System.out.println("--------Priority Queue--------");
		Queue<Integer> pq = new PriorityQueue<Integer>();
		Collections.addAll(pq, 10,15,20,28,12,19,14);
		System.out.println(pq);
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		while(!pq.isEmpty())
		{
			System.out.print(pq.poll()+" ");
		}
	}

}
