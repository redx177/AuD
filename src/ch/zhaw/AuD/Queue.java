package ch.zhaw.AuD;

public class Queue {
	private final LinkedList list;

	public Queue() {
		list = new LinkedList();
	}

	public void enqueue(int i) {
		list.addAtEnd(i);
	}

	public int dequeue() {
		ListNode node = list.getFirst();
		list.removeFirst();
		return node.getData();
	}

	public boolean isEmpty() {
		return list.length() == 0;
	}

	public int length() {
		return list.length();
	}

	/**
	 * For testing.
	 */
	public LinkedList getList() {
		return list;
	}
}
