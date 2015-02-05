import java.util.*;

public class mergeKSorted {
	private class ListNode  {
    	int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	private ListNode merge2Lists(ListNode l1, ListNode l2) {
		ListNode mergedHead = new ListNode(-1);
		ListNode mergedCurr = mergedHead;
		while(true) {
			if (l1 == null && l2 == null) break;
			else if (l1 == null) {
				mergedCurr.next = l2;
				l2 = l2.next;
				mergedCurr = mergedCurr.next;
			}
			else if (l2 == null) {
				mergedCurr.next = l1;
				l1 = l1.next;
				mergedCurr = mergedCurr.next;
			}
			else if (l1.val < l2.val) {
				mergedCurr.next = l1;
				l1 = l1.next;
				mergedCurr = mergedCurr.next;
			}
			else {
				mergedCurr.next = l2;
				l2 = l2.next;
				mergedCurr = mergedCurr.next;
			}
		}
		return mergedHead.next;
	}

	public ListNode mergeKLists(List<ListNode> lists) {
		int N = lists.size();
		if (N == 0) return null;
		if (N == 1) return lists.get(0);
		if (N == 2) return merge2Lists(lists.get(0), lists.get(1));
		ArrayList temp = new ArrayList<ListNode>();
		for (int i = 0; i < N / 2; i++) {
			temp.add(merge2Lists(lists.get(2 * i), lists.get(2 * i + 1)));
		}
		if (N % 2 == 1) {
			temp.add(lists.get(N - 1));
		}
		return mergeKLists(temp);
	}
}