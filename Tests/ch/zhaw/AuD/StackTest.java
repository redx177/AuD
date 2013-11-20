package ch.zhaw.AuD;

import junit.framework.Assert;
import org.junit.Test;

public class StackTest {
	@Test
	public void testPush() {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(7);
		int[] is = stack.getArray();
		Assert.assertEquals(is[0], 3);
		Assert.assertEquals(is[1], 7);
	}

	@Test
	public void testPop() {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(7);
		Assert.assertEquals(stack.pop(), 7);
		Assert.assertEquals(stack.pop(), 3);
	}

	@Test
	public void testIsEmptyWithEmptyList() {
		Stack stack = new Stack();
		Assert.assertTrue(stack.isEmpty());
	}

	@Test
	public void testIsEmptyWithNotEmptyList() {
		Stack stack = new Stack();
		stack.push(1);
		Assert.assertFalse(stack.isEmpty());
	}

	@Test
	public void testLengthWithEmptyList() {
		Stack stack = new Stack();
		Assert.assertEquals(stack.length(), 0);
	}

	@Test
	public void testLengthWithNotEmptyList() {
		Stack stack = new Stack();
		stack.push(1);
		Assert.assertEquals(stack.length(), 1);
	}
}
