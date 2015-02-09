public class maxSubarray {

	public static int maxSubArray(int[] A) {
		if (A.length == 0) return 0;
		if (A.length == 1) return A[0];

		int[] sum = new int[A.length + 1];
		sum[0] = 0;

        for (int i = 1; i < A.length + 1; i++) {
        	int tmp = sum[i - 1] + A[i - 1];
        	sum[i] = (tmp > 0) ? tmp : 0;
        }

        int maxSum = 0;
        for (int i = 1; i < A.length + 1; i++) {
        	if (sum[i] > maxSum) maxSum = sum[i];
  		}

  		if (maxSum > 0) return maxSum;
  		else {
  			int max = A[0];
  			for (int n : A) {
  				if (n > max) max = n;
  			}
  			return max;
  		}
    }

    public static void main(String[] args) {
    	int[] A = {-2, -1, -3};
    	System.out.println(maxSubArray(A));
    }
}