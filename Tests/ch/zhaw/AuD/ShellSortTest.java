package ch.zhaw.AuD;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class ShellSortTest {
	@Test
	public void with10Elements() {
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
	public void with1000Elements() {
		ShellSort sut = new ShellSort(ShellSort.Sequence.Knuth);

		for (int i = 0; i < 1000; i++) {
			sut.add(getRandomNumber());
		}

		List<Integer> sorted = sut.getSorted();
		for (int i : sorted) {
			System.out.println(i);
		}
	}

	@Test
	@Ignore
	public void runtimeCheck() {
		runAndMeasure(ShellSort.Sequence.Shell);
		runAndMeasure(ShellSort.Sequence.Hibbard);
		runAndMeasure(ShellSort.Sequence.Knuth);
	}

	private void runAndMeasure(ShellSort.Sequence sequence) {
		ShellSort sut = new ShellSort(sequence);
		System.out.println("Sequence: " + sequence.toString());
		for (int i = 1; i <= 6; i++) {
			for (int k = 1; k < Math.pow(10, i); k++) {
				sut.add(getRandomNumber());
			}
			long t = System.nanoTime();
			sut.getSorted();
			t = System.nanoTime() - t;
			System.out.printf("# of Elements: 10E%d\t\tSec: %,.10f%n", i, ((float)t)/(1000*1000*1000));
		}
		System.out.println();
	}

	public int getRandomNumber() {
		return 0 + (int)(Math.random() * ((1000) + 1));
	}
}
