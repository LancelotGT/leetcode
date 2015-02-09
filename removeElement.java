public class removeElement {
	public static int removeElement(int[] A, int elem) {
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != elem) {
				A[index++] = A[i];
			}
		}
		for (int n : A) System.out.println(n);
		return index;
	}

	public static void main(String[] args) {
		int[] num = {4, 1, 4, 3, 4, 4, 5, 4};
		System.out.println(removeElement(num, 4));
	}
}