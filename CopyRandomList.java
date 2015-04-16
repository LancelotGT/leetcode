
// Definition for singly-linked list with a random pointer.

public class CopyRandomList {

	class RandomListNode {
	    int label;
	    RandomListNode next, random;
	    RandomListNode(int x) { this.label = x; }
	}

	/* return deep copy of the random list */
    public RandomListNode copyRandomList(RandomListNode head) {
    	if (head == null) return null;
        /* First step: copy the nodes */
        RandomListNode curr = head;
        while (curr != null) {
        	RandomListNode newNode = new RandomListNode(curr.label);
        	newNode.next = curr.next;
        	curr.next = newNode;
        	curr = newNode.next;
        }

        // int count = 0; // indicate if the current node is a copy

        /* Second step: copy the random pointers */
        curr = head;
        while (curr != null) {
    		RandomListNode nextRandom;
    		if (curr.random != null) nextRandom = curr.random.next;
    		else nextRandom = null;
    		curr.next.random = nextRandom;
        	curr = curr.next.next;
        }

        /* Third step: separate the new list into two */
        RandomListNode newHead = head.next;
        curr = head;
        while (curr.next != null) {
        	RandomListNode tmp = curr.next;
        	curr.next = curr.next.next;
        	curr = tmp;
        }
        return newHead;
    }
}