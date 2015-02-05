public class twoSum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
        	for (int j = i; j < numbers.length; j++) {
        		if (numbers[i] + numbers[j] == target) {
        			int[] twoNumbers = {i + 1, j + 1};
        			return twoNumbers;
        		}
        	}
        }
        return null;
    }

    public static void main(String[] args) {
    	// a simple test client
    	int[] numbers = {1, 2, 3, 4, 5};
    	System.out.println(twoSum(numbers, 5)[0]);
    	System.out.println(twoSum(numbers, 5)[1]);
    }
}