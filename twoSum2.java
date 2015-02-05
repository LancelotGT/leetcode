import java.util.*;

public class twoSum2 {
	public int[] twoSum(int[] numbers, int target) {
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (!table.containsKey(numbers[i])) {
				table.put(target - numbers[i], i);
			}
			else {
				int[] pair = {table.get(numbers[i]) + 1, i + 1};
				return pair;
			}
		}
		return null;
	}
}