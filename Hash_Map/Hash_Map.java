package Hash_Map;

import java.util.*;

public class Hash_Map<k, v> {
	class Node {
		k key;
		v value;
		Node next;
	}

	private ArrayList<Node> bukt;
	private int size = 0;

	public Hash_Map(int n) {
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}
	}

	public Hash_Map() {
		this(4);
	}

	public void put(k key, v value) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = bukt.get(idx);
		nn.next = temp;
		bukt.set(idx, nn);
		size++;

		// rehashing
		double lf = (1.0 * size) / bukt.size(); // lf - load factor thf-thress hold factor
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		ArrayList<Node> New_bukt = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			New_bukt.add(null);

		}
		ArrayList<Node> a = bukt;
		bukt = New_bukt;
		size = 0;
		for (Node temp : a) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}
	}

	// Contain Key
	public boolean containKey(k key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	// Get
	public v get(k key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	// Remove
	public v remove(k key) {
		int idx = hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;

		}
		if (curr == null) {
			return null;

		} else if (prev == null) {
			bukt.set(idx, curr.next);
			curr.next = null;
			size--;
			return curr.value;
		} else {
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.value;
		}
	}

//	toString
	@Override
	public String toString() {
		String s = "{";
		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + ",";
				temp = temp.next;
			}
		}
		return s + "}";
	}

	public int hashfun(k key) {
		int idx = key.hashCode() % bukt.size();
		if (idx < 0) {
			idx += bukt.size();
		}
		return idx;
	}

}
