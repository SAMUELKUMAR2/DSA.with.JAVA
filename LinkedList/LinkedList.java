package LinkedList;
public class LinkedList {
class node{
	int data;
	node next;
}
private node head;
private node tail;
private int size;
//O(1)
public void AddFirst(int item) {    
	node nn = new node();
	nn.data = item;
	if(size==0) {
		head =nn;
		tail = nn;
		size++;
	}
	else {
		nn.next = head; 
		head = nn;
		size++;
	}
	
}
public void AddLast(int item) {
	if(size ==0) {
		AddFirst(item);
	}
	else {
		node nn = new node();
		nn.data = item;
		
		tail.next= nn;
		 tail = nn;
		  size++;
	}
}

	public void Addatindex(int item,int k) {
		if(k==0) {
			AddFirst(item);
		}
		else if(k==size){
			AddLast(item);
		}
		else {
		node nn = new node();
		nn.data = item;
		node k_1th = GetNode(k-1);
		nn.next = k_1th.next;
		k_1th.next = nn;
		size++;
		}
	}
	public int getfirst() {
		return head.data;
	}
	public int getlast() {
		return tail.data;
	}
	public int getatindext(int k) {
		return GetNode(k).data;
	}
	//remove first Item
	public int removeFirst() {
		int rv = head.data;
		if(size==1) {
			head = null;
			tail = null;
			size--;
		}
		else {
			node temp = head;
			head = head.next;
			temp.next=null;
			size--;
		}
		return rv;
	}
	//remove last Item
	public int removeLast() {
		if(size==1) {
			return removeFirst();
		}
		else {
			node sl = GetNode(size-2);
			int rv = tail.data;
			tail = sl;
			tail.next = null;
			size--;
			return rv;
	
		}
	}
	// remove from any index
	public int removeatIndex(int k) {
		if(k==0) {
			return removeFirst();
			
		}
		else if(k==size-1) {
			return removeLast();
		}
		else {
			node k_1th = GetNode(k-1);
			node k_th = GetNode(k);
			k_1th.next= k_th.next;
			k_th.next= null;
			size--;
			return k_th.data;
		}
	}
	private node GetNode(int k) {
		node temp = head;
		for(int i = 0;i<k;i++) {
			temp = temp.next;
			
		}
		return temp;
	}
public void  Display() {
	node temp = head;
	while(temp !=null) {
		System.out.print(temp.data+"-->");
		temp = temp.next;
	}
	System.out.println(".");
}
}
