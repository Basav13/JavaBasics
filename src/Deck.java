import java.util.*;
public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(1);
		dq.addFirst(2);
		dq.addLast(3);
		dq.offerFirst(4);
		dq.offerLast(5);
		System.out.println(dq);
		dq.pollFirst();
		dq.pollLast();
		Iterator<Integer> it = dq.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}

}
