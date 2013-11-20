package ch.zhaw.AuD;

import junit.framework.Assert;
import org.junit.Test;

public class QueueTest {
	@Test
	public void testPush() {
		Queue queue = new Queue();
		queue.enqueue(3);
		queue.enqueue(7);
		LinkedList list = queue.getList();
		Assert.assertEquals(list.getFirst().getData(), 3);
		Assert.assertEquals(list.getFirst().getNext().getData(), 7);
	}

	@Test
	public void testDeueue() {
		Queue queue = new Queue();
		queue.enqueue(3);
		queue.enqueue(7);
		Assert.assertEquals(queue.dequeue(), 3);
		Assert.assertEquals(queue.dequeue(), 7);
	}

	@Test
	public void testIsEmptyWithEmptyList() {
		Queue queue = new Queue();
		Assert.assertTrue(queue.isEmpty());
	}

	@Test
	public void testIsEmptyWithNotEmptyList() {
		Queue queue = new Queue();
		queue.enqueue(1);
		Assert.assertFalse(queue.isEmpty());
	}

	@Test
	public void testLengthWithEmptyList() {
		Queue queue = new Queue();
		Assert.assertEquals(queue.length(), 0);
	}

	@Test
	public void testLengthWithNotEmptyList() {
		Queue queue = new Queue();
		queue.enqueue(1);
	Assert.assertEquals(queue.length(), 1);
	}
}
