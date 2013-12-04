package ch.zhaw.AuD;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class ShellSortTest {
	@Test
	public void With10Elements() {
		ShellSort sut = new ShellSort(ShellSort.Sequence.Shell);
		sut.add(100);
		sut.add(400);
		sut.add(200);
		sut.add(700);
		sut.add(400);
		sut.add(400);
		sut.add(800);
		sut.add(300);
		sut.add(50);
		sut.add(90);

		List<Integer> sorted = sut.getSorted();
		Assert.assertEquals(50, (int)sorted.get(0));
		Assert.assertEquals(90, (int)sorted.get(1));
		Assert.assertEquals(100, (int)sorted.get(2));
		Assert.assertEquals(200, (int)sorted.get(3));
		Assert.assertEquals(300, (int)sorted.get(4));
		Assert.assertEquals(400, (int)sorted.get(5));
		Assert.assertEquals(400, (int)sorted.get(6));
		Assert.assertEquals(400, (int)sorted.get(7));
		Assert.assertEquals(700, (int)sorted.get(8));
		Assert.assertEquals(800, (int)sorted.get(9));
	}

	@Test
	@Ignore
	public void With1000Elements() {
		ShellSort sut = new ShellSort(ShellSort.Sequence.Shell);

		for (int i = 0; i < 1000; i++) {
			sut.add(getRandomNumber());
		}

		List<Integer> sorted = sut.getSorted();
		for (int i : sorted) {
			System.out.println(i);
		}
	}

	public int getRandomNumber() {
		return 0 + (int)(Math.random() * ((1000) + 1));
	}
}
