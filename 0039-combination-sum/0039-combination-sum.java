
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    void findCombinations(int[] arr, int target, int index,
                          List<Integer> current,
                          List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        // Include the current number
        current.add(arr[index]);
        findCombinations(arr, target - arr[index], index, current, result);

        // Remove the number (backtracking)
        current.remove(current.size() - 1);

        // Skip the current number
        findCombinations(arr, target, index + 1, current, result);
    }
}
