public class InOrder {

	private static class Node {
		Node left;
		Node right;
		int val;
		private Node(int val) { this.val = val;}
	}

	public void inOrder(Node root) {
		if (root == null) return;
		inOrder(root.left);
		System.out.printf("Node Value: ", root.val);
		inOrder(root.right);
	}
}