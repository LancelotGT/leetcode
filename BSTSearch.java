public class BSTSearch {
	public boolean search(Node root, int val) {
		if (root == null) return false;
		if (root.val < val) search(root.left, val);
		if (root.val > val) search(root.right, val);
		if (root.val == val) return true;
	}
}