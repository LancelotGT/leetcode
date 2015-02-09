import java.util.*;

public class majorityElement {
	public static int majorityElement(int[] num) {

		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer> ();
		for (int n : num) {
			if (table.containsKey(n)) {
				int count = table.get(n);
				table.put(n, count + 1);
			}
			else {
				table.put(n, 1);
			}
		}

		for (int n : num) {
			if (table.get(n) > num.length / 2) return n;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] num = {3, 3, 2, 1, 3, 3, 1};
		System.out.println(majorityElement(num));
	}
}