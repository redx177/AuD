package ch.zhaw.AuD;

import java.util.ArrayList;
import java.util.List;

public class ShellSort {
	private final Sequence sequence;
	private List<Integer> list;

	enum Sequence {
		Shell,
		Hibbard,
		Knuth
	}

	public ShellSort(Sequence sequence) {
		this.sequence = sequence;
		this.list = new ArrayList<Integer>();
	}

	public void add(int i) {
		list.add(i);
	}

	public List<Integer> getSorted() {
		int n = list.size();
		int h = n / 2;

		while (h > 0) {

			for (int i = 0; i < n - h; i++) {
				int e = list.get(i+h);
				int j = i;

				while (j >= 0 && e < list.get(j)) {
					list.set(j+h, list.get(j));
					j = j - h;
				}

				list.set(j+h, e);
			}

			h = h/2;
		}

		return list;
	}
}
