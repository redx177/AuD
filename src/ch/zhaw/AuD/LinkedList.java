package ch.zhaw.AuD;

public class LinkedList {
	private ListNode head;

	public ListNode getFirst() {
		return head;
	}

	public ListNode getLast() {
		if (head == null) return null;

		ListNode node = head;
		while (node.getNext() != null) {
			node = node.getNext();
		}

		return node;
	}

	public void addAtStart(int i) {
		addAtStart(new ListNode(i));
	}

	public void addAtStart(ListNode node) {
		if (head == null) {
			head = node;
			return;
		}

		node.setNext(head);
		node.setPrevious(null);
		head = node;
	}

	public void addAtEnd(int i) {
		addAtEnd(new ListNode(i));
	}

	public void addAtEnd(ListNode node) {
		ListNode last = getLast();

		if (last == null) {
			head = node;
			return;
		}

		last.setNext(node);
		node.setNext(null);
		node.setPrevious(last);
	}

	public int length() {
		if (head == null) return 0;

		ListNode previous = head;
		int i=1;
		while (previous.getNext() != null) {
			previous = previous.getNext();
			i++;
		}

		return i;
	}

	/**
	 * Compares the data of each node.
	 */
	public boolean compareTo(LinkedList list) {
		if (head == null && list.getFirst() == null) return true;

		ListNode nodeLocal = getFirst();
		ListNode nodeExternal = list.getFirst();
		if (nodeLocal.getData() != nodeExternal.getData()) return false;

		while (nodeLocal.getNext() != null) {
			if (nodeExternal.getNext() == null) return false;
			nodeLocal = nodeLocal.getNext();
			nodeExternal = nodeExternal.getNext();
			if (nodeLocal.getData() != nodeExternal.getData()) return false;
		}

		return true;
	}

	public boolean hasNodeWith(int data) {
		ListNode node = head;
		while (node != null && node.getData() != data) {
			node = node.getNext();
		}

		return node != null;
	}

	public void removeFirst() {
		head = head.getNext();
		if (head != null) {
			head.setPrevious(null);
		}
	}
}
