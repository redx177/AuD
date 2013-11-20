package ch.zhaw.AuD;

import junit.framework.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testGetFirstWhenListIsEmpty() {
		LinkedList list = new LinkedList();
		Assert.assertEquals(null, list.getFirst());
	}

	@Test
	public void testGetFirstWhenListHasOneElement() {
		LinkedList list = new LinkedList();
		ListNode node = new ListNode(5);
		list.addAtEnd(node);
		Assert.assertEquals(node, list.getFirst());
	}


	@Test
	public void testGetFirstWhenListHasTwoElements() {
		LinkedList list = new LinkedList();
		ListNode node = new ListNode(5);
		list.addAtEnd(node);
		list.addAtEnd(new ListNode(6));
		Assert.assertEquals(node, list.getFirst());
	}

	@Test
	public void testAddAtEndWhenListIsEmpty() {
		LinkedList list = new LinkedList();
		list.addAtEnd(new ListNode(5));
		Assert.assertEquals(5, list.getFirst().getData());
	}

	@Test
	public void testAddAtEndWhenListHasOneElement() {
		LinkedList list = new LinkedList();
		list.addAtEnd(new ListNode(5));
		list.addAtEnd(new ListNode(6));
		Assert.assertEquals(6, list.getFirst().getNext().getData());
	}

	@Test
	public void testLengthWhenListIsEmpty() {
		LinkedList list = new LinkedList();
		Assert.assertEquals(0, list.length());
	}

	@Test
	public void testLengthWhenListHasOneElement() {
		LinkedList list = new LinkedList();
		list.addAtEnd(new ListNode(5));
		Assert.assertEquals(1, list.length());
	}

	@Test
	public void testLengthWhenListHasTwoElements() {
		LinkedList list = new LinkedList();
		list.addAtEnd(new ListNode(5));
		list.addAtEnd(new ListNode(6));
		Assert.assertEquals(2, list.length());
	}

	@Test
	public void testGetLastWhenListIsEmpty() {
		LinkedList list = new LinkedList();
		Assert.assertEquals(null, list.getLast());
	}

	@Test
	public void testGetLastWhenListHasOneElement() {
		LinkedList list = new LinkedList();
		ListNode node = new ListNode(5);
		list.addAtEnd(node);
		Assert.assertEquals(node, list.getLast());
	}

	@Test
	public void testGetLastWhenListHasTwoElements() {
		LinkedList list = new LinkedList();
		ListNode node2 = new ListNode(6);
		list.addAtEnd(new ListNode(5));
		list.addAtEnd(node2);
		Assert.assertEquals(node2, list.getLast());
	}

	@Test
	public void testAddAtStartWhenListIsEmpty() {
		LinkedList list = new LinkedList();
		ListNode node = new ListNode(5);
		list.addAtStart(node);
		Assert.assertEquals(1, list.length());
		Assert.assertEquals(node, list.getFirst());
	}

	@Test
	public void testAddAtStartWhenHasOneElement() {
		LinkedList list = new LinkedList();
		ListNode node = new ListNode(6);
		list.addAtEnd(new ListNode(5));
		list.addAtStart(node);
		Assert.assertEquals(2, list.length());
		Assert.assertEquals(node, list.getFirst());
	}

	@Test
	public void testCompareToWithTwoEmptyList() {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		Assert.assertTrue(list1.compareTo(list2));
	}

	@Test
	public void testCompareToWithOneMatchingElementEach() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(5));
		LinkedList list2 = new LinkedList();
		list2.addAtEnd(new ListNode(5));
		Assert.assertTrue(list1.compareTo(list2));
	}

	@Test
	public void testCompareToWithOneNotMatchingElementEach() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(5));
		LinkedList list2 = new LinkedList();
		list2.addAtEnd(new ListNode(6));
		Assert.assertFalse(list1.compareTo(list2));
	}

	@Test
	public void testCompareToWithTwoMatchingElementEach() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(5));
		list1.addAtEnd(new ListNode(6));
		LinkedList list2 = new LinkedList();
		list2.addAtEnd(new ListNode(5));
		list2.addAtEnd(new ListNode(6));
		Assert.assertTrue(list1.compareTo(list2));
	}

	@Test
	public void testCompareToWithTwoNotMatchingElementEach() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(5));
		list1.addAtEnd(new ListNode(6));
		LinkedList list2 = new LinkedList();
		list2.addAtEnd(new ListNode(7));
		list2.addAtEnd(new ListNode(8));
		Assert.assertFalse(list1.compareTo(list2));
	}

	@Test
	public void testCompareToWithTwoElementsEachWhereFirstMatchesAndSecondsNotMatching() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(5));
		list1.addAtEnd(new ListNode(6));
		LinkedList list2 = new LinkedList();
		list2.addAtEnd(new ListNode(5));
		list2.addAtEnd(new ListNode(8));
		Assert.assertFalse(list1.compareTo(list2));
	}

	@Test
	public void testCompareToWithTwoElementsEachWhereFirstNotMatchesAndSecondsMatches() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(4));
		list1.addAtEnd(new ListNode(6));
		LinkedList list2 = new LinkedList();
		list2.addAtEnd(new ListNode(5));
		list2.addAtEnd(new ListNode(6));
		Assert.assertFalse(list1.compareTo(list2));
	}

	@Test
	public void testCompareToWithFirstListHasTwoElementsAndSecondListHasOne() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(5));
		list1.addAtEnd(new ListNode(6));
		LinkedList list2 = new LinkedList();
		list2.addAtEnd(new ListNode(5));
		Assert.assertFalse(list1.compareTo(list2));
	}

	@Test
	public void testCompareToWithFirstListHasOneElementAndSecondListHasTwo() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(5));
		LinkedList list2 = new LinkedList();
		list2.addAtEnd(new ListNode(5));
		list1.addAtEnd(new ListNode(6));
		Assert.assertFalse(list1.compareTo(list2));
	}

	@Test
	public void testHasNodeWithWithEmptyList() {
		LinkedList list1 = new LinkedList();
		Assert.assertFalse(list1.hasNodeWith(5));
	}

	@Test
	public void testHasNodeWithWithOneNodeWhichMatches() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(5));
		Assert.assertTrue(list1.hasNodeWith(5));
	}

	@Test
	public void testHasNodeWithWithTwoNodesAndTheSecondMatches() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(4));
		list1.addAtEnd(new ListNode(5));
		Assert.assertTrue(list1.hasNodeWith(5));
	}

	@Test
	public void testHasNodeWithWithTwoNodesWhereNoOneMatches() {
		LinkedList list1 = new LinkedList();
		list1.addAtEnd(new ListNode(6));
		list1.addAtEnd(new ListNode(7));
		Assert.assertFalse(list1.hasNodeWith(5));
	}
}
