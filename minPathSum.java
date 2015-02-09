import java.util.*;

public class minPathSum {
	/* Another example of dynamic programming. */
    public static int minPathSum(int[][] grid) {
    	int height = grid.length;
    	int width = grid[0].length;
    	for (int i = 1; i < width; i++) grid[0][i] = grid[0][i - 1] + grid[0][i];
    	for (int i = 1; i < height; i++) grid[i][0] = grid[i - 1][0] + grid[i][0];
    	for (int i = 1; i < height; i++) {
    		for (int j = 1; j < width; j++) {
    			if (grid[i - 1][j] < grid[i][j - 1]) grid[i][j] += grid[i - 1][j];
    			else grid[i][j] += grid[i][j - 1];
    		}
    	}
    	return grid[height - 1][width - 1];
    }

    public static void main(String[] args) {
    	int[][] grid = {
    		{2},
    		{1},
    		{3}
    	};

    	System.out.println(minPathSum(grid));
    }
}