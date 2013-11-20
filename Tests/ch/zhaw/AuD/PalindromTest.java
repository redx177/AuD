package ch.zhaw.AuD;

import junit.framework.Assert;
import org.junit.Test;

public class PalindromTest {
	@Test
	public void testIsPalindronXYYX() {
		Assert.assertTrue(Palindrom.IsPalindrom("XYYX"));
	}

	@Test
	public void testIsPalindronXYZYX() {
		Assert.assertTrue(Palindrom.IsPalindrom("XYZYX"));
	}

	@Test
	public void testIsPalindronABCXYZYXCBA() {
		Assert.assertTrue(Palindrom.IsPalindrom("ABCXYZYXCBA"));
	}

	@Test
	public void testIsPalindronEmpty() {
		Assert.assertTrue(Palindrom.IsPalindrom(""));
	}

	@Test
	public void testIsPalindronA() {
		Assert.assertTrue(Palindrom.IsPalindrom("A"));
	}
}
