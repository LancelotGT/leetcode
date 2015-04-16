public class FindMin {
    // find the min in a rotated sorted array
    public static int findMin(int[] A) {
        if (A == null || A.length == 0)
            return -1;

        int l = 0;
        int r = A.length - 1;
        int min = A[0];
        while (l < r) {
            int m = (l + r) / 2;
            if (A[l] < A[m]) {
                min = Math.min(A[l], min);
                l = m + 1;
            }
            else if (A[l] > A[m]) {
                min = Math.min(A[m], min);
                r = m - 1;
            }
            else {
                min = Math.min(min, A[l]);
                l++;
            }
        }
        return Math.min(min, A[l]);
    }

    public static void main(String[] args) {
        int[] num = {3, 4, 5, 1, 2};
        System.out.println(findMin(num));
    }
}