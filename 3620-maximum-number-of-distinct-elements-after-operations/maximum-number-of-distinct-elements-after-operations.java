import java.util.*;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int flag = 0;
        long y = Long.MIN_VALUE;  
         for (int num : nums) {
            long min = num - k;
            long max = num + k;
            if (y + 1 <= max) {
                long x = Math.max(y + 1, min);
                y = x;
                flag++;
            }
        }

        return flag;
    }
}
