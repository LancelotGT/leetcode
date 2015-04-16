import java.util.*;

public class connect {

    ArrayDeque<TreeLinkNode> treeTraversal = new ArrayDeque<TreeLinkNode> ();
    public void connect(TreeLinkNode root) {
        levelOrderTraversal(root);
        int nodeWithNullLink = 1;
        int size = treeTraversal.size();
        for (int i = 0; i < size; i++) {
            TreeLinkNode node = treeTraversal.poll();
            System.out.println(node.val);
            if (i == nodeWithNullLink) {
                node.next = null;
                nodeWithNullLink = nodeWithNullLink * 2 + 1;
            } else {
                node.next = treeTraversal.peek();
            }
        }
    }
    
    public void levelOrderTraversal(TreeLinkNode root) {
        ArrayDeque<TreeLinkNode> queue = new ArrayDeque<TreeLinkNode> ();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeLinkNode node = queue.poll();
            treeTraversal.add(node);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}