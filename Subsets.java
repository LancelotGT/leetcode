import java.util.*;
public class Subsets {
    static Set<List<Integer>> hashset = new HashSet<List<Integer>> ();
    
    public static List<List<Integer>> subsets(int[] S) {
        addSubsets(S);
        List<List<Integer>> subsets = new ArrayList<List<Integer>> (hashset);
        return subsets;
    }
    
    public static void addSubsets(int[] S) {
        int length = S.length;
        List<Integer> temp = new ArrayList<Integer> ();
        for (int i = 0; i < length; i++) temp.add(S[i]);
        hashset.add(temp);
        for (int i = 0; i < length; i++) {
            List<Integer> copy = new ArrayList<Integer> (temp);
            copy.remove(i);
            int[] tempArray = new int[length - 1];
            for (int j = 0; j < length - 1; j++) {
                tempArray[j] = copy.get(j);
            }
            addSubsets(tempArray);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        List<List<Integer>> results = subsets(a);
        for (int i = 0; i < results.size(); i++) {
            for (int j = 0; j < results.get(i).size(); j++) {
                System.out.print(results.get(i).get(j));
            }
            System.out.println();
        }
    }
}