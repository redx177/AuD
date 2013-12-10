package ch.zhaw.AuD;

import java.util.ArrayList;
import java.util.List;

public class ShellSort {

	/**
	 * List with items to sort.
	 */
	private List<Integer> list;

	/**
	 * Sequence to use to create h.
	 */
	private final Sequence sequence;

	/**
	 * H values for the provided sequence.
	 */
	private List<Integer> hValues;

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

		initH();
		int hPos = hValues.size()-1;
		int h = hValues.get(hPos);

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

			h = hValues.get(--hPos);
		}

		return list;
	}

	private void initH() {

		int itemCount = list.size();
		int maxHValue = 0;
		int i = 0;
		hValues = new ArrayList<Integer>();
		hValues.add(0);
		while (itemCount > maxHValue) {
			switch (sequence) {
				case Shell:
					maxHValue = (int) Math.pow(2, i);
					break;
				case Hibbard:
					maxHValue = (int) Math.pow(2, i)-1;
					break;
				case Knuth:
					maxHValue = 3*maxHValue+1;
					break;
			}
			i++;
			hValues.add(maxHValue);
		}
		hValues.remove(hValues.size()-1);
	}
}
