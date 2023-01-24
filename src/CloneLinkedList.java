import java.util.*;

class Node
{
	int val;
	Node next;
	Node random;
	
	public Node(int val)
	{
		this.val = val;
		this.next = null;
		this.random = null;
	}
}


class Solve
{
	public Node cloneList(Node head)
	{
		Node iter = head;
		Node front = head;
		while(iter != null)
		{
			front = iter.next;
			Node copy = new Node(iter.val);
			iter.next = copy;
			copy.next = front;
			iter = front;
		}
		
		iter = head;
		while(iter != null)
		{
			if(iter.random != null)
			{
				iter.next.random = iter.random.next;
			}
			iter = iter.next.next;
		}
		iter = head;
		Node pseudo = new Node(0);
		Node copy = pseudo;
		while(iter != null)
		{
			front = iter.next.next;
			copy.next = iter.next;
			copy = copy.next;
			iter.next = front;
			iter = iter.next;
		}
		return pseudo.next;
	}
}

public class CloneLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Node n3 = new Node(40);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n1.random = n3;
		
		Solve obj = new Solve();
		Node new_head = obj.cloneList(head);
		Node cur = new_head;
		while(cur != null)
		{
			System.out.println(cur.val);
			if(cur.random != null)
				System.out.println(cur.random.val);
			cur = cur.next;
		}

	}

}
