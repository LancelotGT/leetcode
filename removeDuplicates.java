public class removeDuplicates {
	public static int removeDuplicates(int[] A) {
		int len = A.length;
		if (len <= 1) return len;
		int curr = 1;
		for (int i = 1; i < len; i++) {
			if (A[i] != A[i - 1]) {
				A[curr++] = A[i];
			}
		}
		return curr;
	}

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 3, 4, 4, 5, 6, 6};
		System.out.println(removeDuplicates(A));
	}
}