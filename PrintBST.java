import java.util.List;

public class PrintBST {

	private static class Node {
		Node left;
		Node right;
		int val;
		private Node(int val) {
			this.val = val;
		}
	}
	public void printBST(Node root, List<Integer> list) {
		if (root == null) return;
		list.add(root.val);
		if (root.left == null && root.right == null) {
			System.out.println(list);
            list.remove((Integer)root.val);
            return;
        }
		printBST(root.left, list);
		printBST(root.right, list);
        list.remove((Integer)root.val);
	}

    public void printBST2(Node root, int[] path, int len) {
        if (root == null) return;
        path[len++] = root.val;
        if (root.left == null && root.right == null) {
            for (int i = 0; i < len; i++) {
                System.out.print(path[len]);
                System.out.println(" ");
            }
            System.out.println();
        }

        printBST2(root.left, path, len);
        printBST2(root.right, path, len);
    }
}