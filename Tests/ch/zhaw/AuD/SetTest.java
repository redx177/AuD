package ch.zhaw.AuD;

import junit.framework.Assert;
import org.junit.Test;

public class SetTest {
	@Test
	public void testContainsWithEmptyList() {
		Set set = new Set();
		Assert.assertFalse(set.contains(1));
	}

	@Test
	public void testContainsWithOneItemWhichDoesNotMatch() {
		Set set = new Set();
		set.add(2);
		Assert.assertFalse(set.contains(1));
	}

	@Test
	public void testContainsWithOneItemWhichDoesMatch() {
		Set set = new Set();
		set.add(1);
		Assert.assertTrue(set.contains(1));
	}

	@Test
	public void testContainsWithTwoItemsWhereTheFirstDoesMatch() {
		Set set = new Set();
		set.add(1);
		set.add(2);
		Assert.assertTrue(set.contains(1));
	}

	@Test
	public void testContainsWithTwoItemsWhereTheSecondDoesMatch() {
		Set set = new Set();
		set.add(2);
		set.add(1);
		Assert.assertTrue(set.contains(1));
	}

	@Test
	public void testToStringWithEmptyList() {
		Set set = new Set();
		Assert.assertEquals("{}", set.toString());
	}

	@Test
	public void testToStringOneItem() {
		Set set = new Set();
		set.add(1);
		Assert.assertEquals("{1}", set.toString());
	}

	@Test
	public void testToStringTwoItems() {
		Set set = new Set();
		set.add(1);
		set.add(2);
		Assert.assertEquals("{2,1}", set.toString());
	}

	@Test
	public void testAddWithOneItem() {
		Set set = new Set();
		set.add(1);
		Assert.assertTrue(set.contains(1));
		Assert.assertEquals(1, set.length());
	}

	@Test
	public void testAddWithTwoDifferentItems() {
		Set set = new Set();
		set.add(1);
		set.add(2);
		Assert.assertTrue(set.contains(1));
		Assert.assertTrue(set.contains(2));
		Assert.assertEquals(2, set.length());
	}

	@Test
	public void testAddWithTwoSameItems() {
		Set set = new Set();
		set.add(1);
		set.add(1);
		Assert.assertTrue(set.contains(1));
		Assert.assertEquals(1, set.length());
	}

	@Test
	public void testAddWithThreeItemsWhereTwoAreTheSame() {
		Set set = new Set();
		set.add(1);
		set.add(1);
		set.add(2);
		Assert.assertTrue(set.contains(1));
		Assert.assertTrue(set.contains(2));
		Assert.assertEquals(2, set.length());
	}

	@Test
	public void testUniteWithWithTwoEmptySets() {
		Set set1 = new Set();
		Set set2 = new Set();
		Set set3 = set1.uniteWith(set2);
		Assert.assertEquals(0, set3.length());
	}

	@Test
	public void testUniteWithWithTwoSetsWithOneElementEach() {
		Set set1 = new Set();
		set1.add(1);

		Set set2 = new Set();
		set2.add(2);

		Set set3 = set1.uniteWith(set2);
		Assert.assertEquals(2, set3.length());
		Assert.assertTrue(set3.contains(1));
		Assert.assertTrue(set3.contains(2));
	}

	@Test
	public void testUniteWithWithTwoSetsWhereTheFirstHasOneElementAndTheSecondNone() {
		Set set1 = new Set();
		set1.add(1);

		Set set2 = new Set();

		Set set3 = set1.uniteWith(set2);
		Assert.assertEquals(1, set3.length());
		Assert.assertTrue(set3.contains(1));
	}

	@Test
	public void testUniteWithWithTwoSetsWhereTheFirstHasNoeElementAndTheSecondHasOne() {
		Set set1 = new Set();

		Set set2 = new Set();
		set2.add(1);

		Set set3 = set1.uniteWith(set2);
		Assert.assertEquals(1, set3.length());
		Assert.assertTrue(set3.contains(1));
	}

	@Test
	public void testUniteWithWithTwoSetsWhereEachHasOneElementWihchIsTheSame() {
		Set set1 = new Set();
		set1.add(1);

		Set set2 = new Set();
		set2.add(1);

		Set set3 = set1.uniteWith(set2);
		Assert.assertEquals(1, set3.length());
		Assert.assertTrue(set3.contains(1));
	}

	@Test
	public void testIntersectWithWithTwoEmptySets() {
		Set set1 = new Set();
		Set set2 = new Set();
		Set set3 = set1.intersectWith(set2);
		Assert.assertEquals(0, set3.length());
	}

	@Test
	public void testIntersectWithWithTwoSetsWithNoMatchingElements() {
		Set set1 = new Set();
		set1.add(1);

		Set set2 = new Set();
		set2.add(2);

		Set set3 = set1.intersectWith(set2);
		Assert.assertEquals(0, set3.length());
	}

	@Test
	public void testIntersectWithWithTwoSetsWithOneElementEachWichMatches() {
		Set set1 = new Set();
		set1.add(1);

		Set set2 = new Set();
		set2.add(1);

		Set set3 = set1.intersectWith(set2);
		Assert.assertEquals(1, set3.length());
		Assert.assertTrue(set3.contains(1));
	}

	@Test
	public void testIntersectWithWithTwoSetsWhereOneHas5ElementsAndTheOther4And2Matches() {
		Set set1 = new Set();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		Set set2 = new Set();
		set2.add(1);
		set2.add(6);
		set2.add(4);
		set2.add(7);

		Set set3 = set1.intersectWith(set2);
		Assert.assertEquals(2, set3.length());
		Assert.assertTrue(set3.contains(1));
		Assert.assertTrue(set3.contains(4));
	}

	@Test
	public void testCompareToWithTwoEmptyLists() {
		Set set1 = new Set();
		Set set2 = new Set();
		Assert.assertTrue(set1.compareTo(set2));
	}

	@Test
	public void testCompareToWithTwoListsWithOneMatchingElementEach() {
		Set set1 = new Set();
		set1.add(1);

		Set set2 = new Set();
		set2.add(1);

		Assert.assertTrue(set1.compareTo(set2));
	}

	@Test
	public void testCompareToWithTwoListsWithOneNotMatchingElementEach() {
		Set set1 = new Set();
		set1.add(1);

		Set set2 = new Set();
		set2.add(2);

		Assert.assertFalse(set1.compareTo(set2));
	}

	@Test
	public void testCompareToWithTwoListsWithTwoMatchingElementsEach() {
		Set set1 = new Set();
		set1.add(1);
		set1.add(2);

		Set set2 = new Set();
		set2.add(2);
		set2.add(1);
		set2.add(1);

		Assert.assertTrue(set1.compareTo(set2));
	}

	@Test
	public void testCompareToWithTwoListsWithTwoNotMatchingElementsEach() {
		Set set1 = new Set();
		set1.add(1);
		set1.add(2);

		Set set2 = new Set();
		set2.add(3);
		set2.add(1);

		Assert.assertFalse(set1.compareTo(set2));
	}

	@Test
	public void testCompareToWithTwoListsWhereOneHasThreeElementsAndTheOtherHasTwo() {
		Set set1 = new Set();
		set1.add(1);
		set1.add(2);

		Set set2 = new Set();
		set2.add(2);
		set2.add(1);
		set2.add(3);

		Assert.assertFalse(set1.compareTo(set2));
	}
}
