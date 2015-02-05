public class sameTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true;
		if (p == null || q == null) return false;
		if (p.val != q.val) return false;
		if (isSameTree(p.left, q.left) && (isSameTree(p.right, q.right))) return true;
		else return false;
	}
}