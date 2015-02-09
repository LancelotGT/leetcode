public class rotate {
	public static void rotate(int[][] matrix) {
		int height = matrix.length;
		int width = matrix[0].length;
		if (width == 1 || height == 1) return;
		for (int i = 0; i < height / 2; i++) {
			for (int j = i; j < width - i - 1; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[height - j - 1][i];
				matrix[height - j - 1][i] = matrix[height - i - 1][width - j - 1];
				matrix[height - i - 1][width - j - 1] = matrix[j][width - i - 1];
				matrix[j][width - i - 1] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};

		rotate(matrix);

		for (int[] n : matrix) {
			for (int num : n) System.out.print(num + " ");
			System.out.println("");
		}
	}
}