public class uniquePaths2 {

	public static int uniquePaths(int m, int n) {
		if (m == 0 || n == 0) return 0;
		if (m == 1 || n == 1) return 1;
		
		double totalSteps = (double) m + n - 2;
		double downSteps = (double) n - 1;
		double tmp = 1;
		for (int i = 0; i < downSteps; i++) {
			tmp = tmp * (totalSteps - (double) i) / ((double) i + 1);
		}

		return (int) Math.round(tmp);
	}

	public static void main(String[] args) {
		System.out.println(uniquePaths(2, 100));
	}
}