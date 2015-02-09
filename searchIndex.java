public class searchIndex {

	public static int binarySearch(int[] A, int target, int lo, int hi) {
		if (lo == hi) {
			return (A[lo] >= target) ? lo : lo + 1;
		}
		int mid = (lo + hi) / 2;
		if (target == A[mid]) return mid;
		else if (target > A[mid]) return binarySearch(A, target, mid + 1, hi);
		else return binarySearch(A, target, lo, mid);
	}

	public static int searchIndex(int[] A, int target) {
		if (A.length == 0) return -1;
		else return binarySearch(A, target, 0, A.length - 1);
	}

	public static void main(String[] args) {
		// test client
		int[] A = {1, 2, 3, 4, 6};
		System.out.println(searchIndex(A, 0));
	}
}