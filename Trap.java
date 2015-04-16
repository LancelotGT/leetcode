public class Trap {
    public int trap(int[] A) {
        int length = A.length;
        if (length <= 2) return 0;
        int maxIndex = 0;
        for (int i = 0; i < length; i++) {
            if (A[i] > A[maxIndex]) maxIndex = i;
        }
        int sum = 0;
        int currMax = A[0];
        for (int i = 0; i < maxIndex; i++) {
            if (A[i] >= currMax) {
                currMax = A[i];
            } else {
                sum += (currMax - A[i]);
            }
        }
        currMax = A[length - 1];
        for (int i = length - 1; i > maxIndex; i--) {
            if (A[i] >= currMax) {
                currMax = A[i];
            } else {
                sum += (currMax - A[i]);
            }
        }
        return sum;
    }
}