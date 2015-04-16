public class SecondLargest {
	public static int findSecond (int[] a) {
		if (a == null)
			throw new RuntimeException("Input is null.");
		int length = a.length;
		if (length == 0)
			throw new RuntimeException("Input is an empty array.");

		int max = a[0];
		int secmax = -1;
		for (int i = 1; i < length; i++) {
			if (a[i] > max) {
				secmax = max;
				max = a[i];
			}
			else if (a[i] > secmax)
				secmax = a[i];
		}
		return secmax;
	}

	public static void main(String[] args) {
		// test client
		int[] a = {2, 1, 3, 4, 5, 3, 2, 3};
		System.out.printf("The second largest number is %d. \n", findSecond(a));
	}
}