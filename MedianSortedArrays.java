public class MedianSortedArrays {
	
	public static double findMedianSortedArrays(int[] A, int[] B) {
		int len1 = A.length;
		int len2 = B.length;
		int[] C = new int[len1 + len2];
		int k = 0, j = 0, i = 0;
		if (len1 == 0 && len2 == 0) return -1;
		else if (len1 == 0) C = B;
		else if (len2 == 0) C = A;
		else {
		    while(i < len1 || j < len2) {
				if (i > len1 - 1) C[k++] = B[j++];
				else if (j > len2 - 1) C[k++] = A[i++];
				else if (A[i] < B[j]) C[k++] = A[i++];
				else if (A[i] > B[j]) C[k++] = B[j++];
		    }
		}

		if ((len1 + len2) % 2 == 1) return (double) C[(len1 + len2) / 2];
		else return ((double) C[(len1 + len2) / 2 - 1] + (double) C[(len1 + len2) / 2]) / 2;
	}

	public static void main(String[] args) {
		// a simple test client
		int[] array1 = {};
		int[] array2 = {};
		double median = findMedianSortedArrays(array1, array2);
		System.out.println(median);
	}
}