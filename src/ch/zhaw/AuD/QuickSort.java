package ch.zhaw.AuD;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	private List<Integer> list;

	public QuickSort() {
		this.list = new ArrayList<Integer>();
	}

	public void add(int i) {
		list.add(i);
	}

	public List<Integer> getSorted() {
		sort(0, list.size()-1);
		return list;
	}

	private void sort(int first, int last) {

		if (first < last) {
			int x = list.get((first+last)/2);
			int i = first;
			int j = last;

			do {
				while (list.get(i) < x) {
					i++;
				}
				while (x < list.get(j)) {
					j--;
				}
				if (i <= j) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					i++;
					j--;
				}
			} while (i <= j);

			sort(first, j);
			sort(i,last);
		}
	}
}
