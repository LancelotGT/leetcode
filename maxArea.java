public class maxArea {
	public static int maxArea(int[] height) {
		int len = height.length;
		if (len <= 1) return 0;
		int max = 0, lt = 0, rt = len - 1; 
		while (lt < rt) {
			int tmp = 0;
			if (height[lt] < height[rt]) {
				tmp = height[lt] * (rt - lt);
				lt++;
			}
			else {
				tmp = height[rt] * (rt - lt);
				rt--;
			}
			if (tmp > max) max = tmp;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] height = {2, 4, 1, 4};
		System.out.println(maxArea(height));
	}
}