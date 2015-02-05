import java.util.*;

public class linkedListsCycle {
	class ListNode {
	    int val;
		ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}

	public boolean hasCycle(ListNode head) {
		ListNode curr = head;
		Hashtable<ListNode, Boolean> table = new Hashtable<ListNode, Boolean> ();
		while (curr != null) {
			if (table.containsKey(curr)) return true;
			else table.put(curr, true);
			curr = curr.next;
		}
		return false;
	}
}