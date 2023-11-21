package LinkedList;

public class LinkListClient {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddLast(40);
		ll.AddLast(50);
		ll.AddLast(70);
		ll.Display();
		ll.Addatindex(100, 2);
		ll.Display();
		
		System.out.println(ll.removeFirst()); 
		ll.Display();
		System.out.println(ll.removeLast());
		ll.Display();
		System.out.println(ll.removeatIndex(3));
		ll.Display();
		
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getatindext(2));
	}

}
