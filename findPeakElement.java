public class findPeakElement {
	/* return the index of the peak element */
	public static int findPeakElement(int[] num) {
		int len = num.length;
		if (len == 1) return 0;
		if (num[0] > num[1]) return 0;
		if (num[len - 1] > num[len - 2]) return len - 1;
		for (int i = 1; i < len - 1; i++) {
			if (num[i] > num[i - 1] && num[i] > num[i + 1])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 2, 1};
		System.out.println(findPeakElement(num));
	}
}