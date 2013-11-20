package ch.zhaw.AuD;

/**
 * Set implementation with characteristics
 * corresponding to <link>http://en.wikipedia.org/wiki/Set_(abstract_data_type)</link>:
 * 1. Can not contain the same item twice.
 * 2. Has no particular order.
 */
public class Set {

	private final LinkedList list;

	public Set() {
		list = new LinkedList();
	}

	public boolean contains(int i) {
		return list.hasNodeWith(i);
	}

	public String toString() {
		ListNode node = list.getFirst();

		if (node == null) return "{}";

		StringBuilder sb = new StringBuilder("{"+node.getData());
		while (node.getNext() != null) {
			node = node.getNext();
			sb.append(","+node.getData());
		}

		sb.append("}");
		return sb.toString();
	}

	public void add(int i) {
		if (!list.hasNodeWith(i)) {
			list.addAtStart(new ListNode(i));
		}
	}

	/**
	 * Unites this set with the provided one
	 * and returns a brand new set.
	 */
	public Set uniteWith(Set externalSet) {
		Set set = new Set();

		ListNode node = getList().getFirst();
		while (node != null) {
			set.add(node.getData());
			node = node.getNext();
		}

		node = externalSet.getList().getFirst();
		while (node != null) {
			set.add(node.getData());
			node = node.getNext();
		}

		return set;
	}

	/**
	 * Searches the intersection of this and the provided set
	 * and returns a brand new set.
	 */
	public Set intersectWith(Set externalSet) {
		Set set = new Set();

		ListNode node = getList().getFirst();
		while (node != null) {
			if (externalSet.contains(node.getData())) {
				set.add(node.getData());
			}
			node = node.getNext();
		}

		return set;
	}

	public int length() {
		return list.length();
	}

	public boolean compareTo(Set s) {
		if (s.length() != length()) return false;

		ListNode node = getList().getFirst();
		while (node != null) {
			if (!s.contains(node.getData())) return false;
			node = node.getNext();
		}

		return true;
	}

	public LinkedList getList() {
		return list;
	}
}
