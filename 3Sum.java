import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class 3Sum {
    public List<List<Integer>> threeSum(int[] num) {
        if (num == null || num.length < 3) return null;
        Arrays.sort(num);
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], true);
        }
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int target = -num[i]-num[j];
                if (map.containsKey(target)) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(num[i]);
                    list.add(num[j]);
                    if (target < num[i]) list.add(0, target);
                    else if (target < num[j]) list.add(1, target);
                    else list.add(2, target);
                    results.add(list);
                }
            }
        }
        return results;
    }
    
    public static void main () {
        
    }
}