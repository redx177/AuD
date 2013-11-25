package ch.zhaw.AuD;

import junit.framework.Assert;
import org.junit.Test;

public class PalindromTest {
	@Test
	public void testIsPalindromXYYX() {
		Assert.assertTrue(Palindrom.IsPalindrom("XYYX"));
	}

	@Test
	public void testIsPalindromXYZYX() {
		Assert.assertTrue(Palindrom.IsPalindrom("XYZYX"));
	}

	@Test
	public void testIsPalindromABCXYZYXCBA() {
		Assert.assertTrue(Palindrom.IsPalindrom("ABCXYZYXCBA"));
	}

	@Test
	public void testIsPalindromEmpty() {
		Assert.assertTrue(Palindrom.IsPalindrom(""));
	}

	@Test
	public void testIsPalindromA() {
		Assert.assertTrue(Palindrom.IsPalindrom("A"));
	}

	@Test
	public void testIsNoPaolindrom() {
		Assert.assertFalse(Palindrom.IsPalindrom("AB"));
	}
}
