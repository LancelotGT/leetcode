public class findMin {
	public static int findMin(int[] num) {
		if (num.length == 0) return -1;
		if (num.length == 1) return num[0];

		int last = num[0];
		for (int n : num) {
			if (n < last) return n;
			else last = n;
		}
		return num[0];
	}

	public static void main(String[] args) {
		int[] num = {4, 4, 5, 2, 3};
		System.out.println(findMin(num));
	}
}