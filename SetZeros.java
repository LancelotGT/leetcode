public class SetZeros {
	public static void setZeroes(int[][] matrix) {
        if (matrix.length == 0) return;
        int m = matrix[0].length;
        int n = matrix.length;
        Boolean[] zeros = new Boolean[m + n];
        for (int i = 0; i < m + n; i++) {
        	zeros[i] = false;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeros[j] = true;
                    zeros[m + i] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (zeros[j] == true || zeros[m + i] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
    	int[][] matrix = {{1}};
    	setZeroes(matrix);
    }
}