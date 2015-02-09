public class search {

    public static int search(int[] A, int target) {
    	int lo = 0, hi = A.length - 1;
    	if (lo == hi) return (A[0] == target) ? 0 : -1;
        while (lo < hi) {
        	int mid = (lo + hi) / 2;
        	if (target == A[mid]) return mid;
        	else if (target == A[lo]) return lo;
        	else if (target == A[hi]) return hi;
        	else if (A[lo] == A[mid] && A[mid] != A[hi]) return linearSearch(A, target, mid + 1, hi);
        	else if (A[mid] == A[hi] && A[mid] != A[lo]) return linearSearch(A, target, lo, mid - 1);
        	else if (A[mid] == A[hi] && A[mid] == A[lo]) return linearSearch(A, target, 0, A.length - 1);
        	else if (target > A[mid] && target < A[hi]) lo = mid + 1;
        	else if (target < A[mid] && target > A[lo]) hi = mid - 1;
        	else if (A[mid] > A[lo] && A[mid] > A[hi]) lo = mid + 1; 
        	else hi = mid - 1;
        }
        return -1;
    }

    public static int linearSearch(int[] A, int target, int lo, int hi) {
    	for (int i = lo; i <= hi; i++) {
    		if (target == A[i]) return i;
    	}
    	return -1;
    }

    public static void main(String[] args) {
    	int[] A = {1, 3, 1, 1, 1};
    	System.out.println(search(A, 3));
    }
}