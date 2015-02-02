import java.util.Arrays;

public class singleNumber {
    public static int singleNumber(int[] A) {
        if (A.length == 0) return -1;
        if (A.length == 1) return A[0];
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if ((i % 2 == 1) && (A[i] != A[i - 1])) return A[i - 1];
            if (i == A.length - 1) return A[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        /* A simple test client. */
        int[] A = {1, 2, 2, 5, 3, 5, 3, 4, 1};
        System.out.println(singleNumber(A));
    }
}