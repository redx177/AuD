package ch.zhaw.AuD;

import org.junit.Assert;
import org.junit.Test;

public class HanoiTest {
	@Test
	public void test3() {
		StringBuffer s = new Hanoi().AC(3);
		Assert.assertEquals("AC  AB  CB  AC  BA  BC  AC", s.toString().trim());
	}

	@Test
	public void test4() {
		StringBuffer s = new Hanoi().AC(4);
		Assert.assertEquals("AB  AC  BC  AB  CA  CB  AB  AC  BC  BA  CA  BC  AB  AC  BC", s.toString().trim());
	}

	@Test
	public void test5() {
		StringBuffer s = new Hanoi().AC(5);
		Assert.assertEquals("AC  AB  CB  AC  BA  BC  AC  AB  CB  CA  BA  CB  AC  AB  CB  AC  BA  BC  AC  BA  CB  CA  BA  BC  AC  AB  CB  AC  BA  BC  AC", s.toString().trim());
	}
}
