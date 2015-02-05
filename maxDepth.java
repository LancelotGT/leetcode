public class maxDepth {
	public static int maxDepth(TreeNode root) {
		if (root == null) return 0;
		if (root.left == null && root.right == null) return 1;
		int leftDepth = 0;
		int rightDepth = 0;
		if (root.left != null) leftDepth = maxDepth(root.left);
		if (root.right != null) rightDepth = maxDepth(root.right);
		if (leftDepth > rightDepth) return leftDepth + 1;
		else return rightDepth + 1;
	}
}