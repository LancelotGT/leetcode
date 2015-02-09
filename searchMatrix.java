public class searchMatrix {

	public static boolean binarySearch(int[] line, int target) {
		int lo = 0, hi = line.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (target == line[mid]) return true;
			else if (lo == hi) return false;
			else if (target < line[mid]) hi = mid;
			else lo = mid + 1;
		}
		return false;
	}

	public static boolean search(int[][] matrix, int target) {
		int len = matrix[0].length;
		int lo = 0, hi = matrix.length - 1;
		while(lo <= hi) {
			int mid = (lo + hi) / 2;
			if (target >= matrix[mid][0] && target <= matrix[mid][len - 1]) return binarySearch(matrix[mid], target);
			else if (lo == hi) return false;
			else if (target < matrix[mid][0]) hi = mid;
			else if (target > matrix[mid][len - 1]) lo = mid + 1;
		}
		return false;
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		return search(matrix, target);
	}

	public static void main(String[] args) {
		int[][] matrix = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 16, 17}
		};

		System.out.println(searchMatrix(matrix, 3));
	}
}