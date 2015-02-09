public class sortColors {
	/* This program is really for three way quicksort not for sortColors..*/
	private static void exch(int[] a, int i1, int i2) {
		int temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;
	}

	private static void sort(int[] a, int lo, int hi) {
		/* This is 3-way quicksort */
		if (hi <= lo) return;
		int lt = lo, i = lo + 1, gt = hi;
		int v = a[lo];
		while (i <= gt) {
			if (a[i] < v) exch(a, lt++, i++);
			else if (a[i] > v) exch(a, i, gt--);
			else i++;
		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}

	public static void sortColors(int[] A) {
		sort(A, 0, A.length - 1);
	}

	public static void main(String[] args) {
		/* a simple test client */
		int[] a = {2, 3, 6, 1, 0, -5, 3, 8};
		sortColors(a);
		for (int n : a) System.out.println(n);
	}
}