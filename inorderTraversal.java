import java.util.*;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class inorderTraversal {
	private List<Integer> traversal;

	public class TreeNode {
      	int val;
      	TreeNode left;
      	TreeNode right;
      	TreeNode(int x) { val = x; }
 	}

    
    private void traverse(TreeNode root) {
    	if (root == null) return;
		traverse(root.left);
		traversal.add(root.val);
		traverse(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
    	traversal = new ArrayList<Integer> ();
    	traverse(root);
    	return traversal;
    }
}