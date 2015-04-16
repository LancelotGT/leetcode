public class Solution {
    List<Integer> traversalResults = new ArrayList<Integer> ();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root = null) return traversalResults;
        preorderTraversal2(root);
        return traversalResults;
    }
    
    public void preorderTraversal2(TreeNode root) {
        traversalResults.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}