package ch.zhaw.AuD;

public class Stack {
	private int[] array;
	private int i;

	public Stack() {
		array = new int[100];
		i = 0;
	}

	public void push(int i) {
		array[this.i++] = i;
	}

	public int pop() {
		i--;
		int temp = array[i];
		return temp;
	}

	public boolean isEmpty() {
		return i == 0;
	}

	public int length() {
		return i;
	}

	/**
	 * For testing.
	 */
	public int[] getArray() {
		return array;
	}
}
