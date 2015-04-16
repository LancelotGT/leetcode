public class GenerateMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int directionIndicator = 1;
        int i = 0, j = 0, number = 1;
        if (n == 0) return matrix;
        if (n == 1) {
            matrix[0][0] = 1;
            return matrix;
        }

        while (directionIndicator != -1) {
            // System.out.print("direction: ");System.out.println(directionIndicator);
            // System.out.print("i: ");System.out.println(i);
            // System.out.print("j: ");System.out.println(j);
            // System.out.print("number: ");System.out.println(number);
            if (directionIndicator == 2) {
                matrix[i][j] = number++;
                if ((i + 1 >= n) || (matrix[i + 1][j] != 0)) {
                    directionIndicator = 3;
                    j--;
                } else {
                    i++;
                }
            } else if (directionIndicator == 1) {
                matrix[i][j] = number++;
                if ((j + 1 >= n) || (matrix[i][j + 1] != 0)) {
                    directionIndicator = 2;
                    i++;
                } else {
                    j++;
                }
            } else if (directionIndicator == 4) {
                matrix[i][j] = number++;
                if ((i - 1 < 0) || (matrix[i - 1][j] != 0)) {
                    directionIndicator = 1;
                    j++;
                } else {
                    i--;
                }
            } else if (directionIndicator == 3) {
                matrix[i][j] = number++;
                if ((j - 1 < 0) || (matrix[i][j - 1] != 0)) {
                    directionIndicator = 4;
                    i--;
                } else {
                    j--;
                }
            }
            
            System.out.print("i: ");System.out.println(i);
            System.out.print("j: ");System.out.println(j);
            if (matrix[i][j] != 0) {
                directionIndicator = -1;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        System.out.print(matrix[0][0]);
        System.out.print(matrix[0][1]);
        System.out.println(matrix[0][2]);
        System.out.print(matrix[1][0]);
        System.out.print(matrix[1][1]);
        System.out.println(matrix[1][2]);
        System.out.print(matrix[2][0]);
        System.out.print(matrix[2][1]);
        System.out.println(matrix[2][2]);
    }
}