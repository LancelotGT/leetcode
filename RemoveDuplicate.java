public class RemoveDuplicate {
    public int removeDuplicates(int[] A) {
        int length = A.length;
        if (length <= 2) return length;
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (i > length - 3 || A[i + 2] > A[i]) {
                A[j++] = A[i];
            }
        }
        return j;
    }
}