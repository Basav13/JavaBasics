import java.util.*;

class Nody
{
	int key , value;
	Nody prev,next;
	Nody(int key , int value)
	{
		this.key = key;
		this.value  = value;
	}	
}
public class LRUCache {
	Nody head = new Nody(0,0);
	Nody tail = new Nody(0,0);
	int cap;
	Map<Integer,Nody> mp = new HashMap<Integer,Nody>();
	
	public LRUCache(int cap)
	{
		this.cap = cap;
		head.next = tail;
		tail.prev = head;
	}
	
	private void insert(Nody node)
	{
		mp.put(node.key,node);
		Nody headNext = head.next;
		head.next = node;
		node.prev = head;
		node.next = headNext;
		headNext.prev = node;
	}
	
	private void remove(Nody node)
	{
		mp.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	
	public int get(int key)
	{
		if(mp.containsKey(key))
		{
			Nody node = mp.get(key);
			remove(node);
			insert(node);
			return node.value;
		}
		else
		{
			return -1;
		}
	}
	
	public void put(int key , int value)
	{
		if(mp.containsKey(key))
		{
			mp.remove(key);
		}
		if(mp.size() == cap)
			remove(tail.prev);
		insert(new Nody(key,value));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache lru = new LRUCache(3);
		lru.put(1, 1);
		lru.put(2, 2);
		lru.put(3, 3);
		System.out.println(lru.get(2));
		lru.get(1);
		lru.put(4, 4);
		System.out.println(lru.get(3));
		
	}

}
