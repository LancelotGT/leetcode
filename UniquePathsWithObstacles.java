public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // use dynamic programming
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        if (height == 0 || width == 0) return 0;
        // if (height == 1 && width == 1 && obstacleGrid[0] == 0) {
        //     return 1;
        // }
        int[][] record = new int[height][width];
        record[height - 1][width - 1] = 1;
        for (int i = height - 1; i >= 0; i--) {
            for (int j = width - 1; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    record[i][j] = 0;
                }
                else {
                    int sum = 0;
                    if (i + 1 < height) {
                        sum += record[i + 1][j];
                    }
                    if (j + 1 < width) {
                        sum += record[i][j + 1];
                    }
                    if (i + 1 < height || j + 1 < width)
                        record[i][j] = sum;
                }
            }
        }
        return record[0][0];
    }
}