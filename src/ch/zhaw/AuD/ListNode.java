package ch.zhaw.AuD;

public class ListNode {
	private ListNode next;
	private ListNode previous;
	private int data;

	public ListNode(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public ListNode getPrevious() {
		return previous;
	}

	public void setPrevious(ListNode previous) {
		this.previous = previous;
	}
}
