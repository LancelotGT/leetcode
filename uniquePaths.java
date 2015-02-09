public class uniquePaths {

	public static int move(int posX, int posY, int m, int n) {
		if (posX + 1 >= m && posY >= n) return 1;
		else if (posX + 1 >= m) return move(posX, posY + 1, m, n);
		else if (posY + 1 >= n) return move(posX + 1, posY, m, n);
		else return move(posX + 1, posY, m, n) + move(posX, posY + 1, m, n);
	}

	public static int uniquePaths(int m, int n) {
		if (m == 0 || n == 0) return 0;
		if (m == 1 || n == 1) return 1;
		return move(1, 0, m, n) + move(0, 1, m, n);
	}

	public static void main(String[] args) {
		System.out.println(uniquePaths(1, 3));
	}
}