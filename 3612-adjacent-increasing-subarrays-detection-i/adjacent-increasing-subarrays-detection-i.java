import java.util.*;

class Solution {
     public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for (int i = 0; i + 2 * k <= n; i++) {
            boolean first = isIncreasing(nums, i, k);
            boolean second = isIncreasing(nums, i + k, k);

            if (first && second) {
                return true; 
            }
        }
        return false;
    }
    private boolean isIncreasing(List<Integer> nums, int a, int k) {
        for (int i = a; i < a + k - 1; i++) {
            int current = nums.get(i);
            int next = nums.get(i + 1);

            if (current >= next) { 
                return false;
            }
        }
        return true;
    }
}
