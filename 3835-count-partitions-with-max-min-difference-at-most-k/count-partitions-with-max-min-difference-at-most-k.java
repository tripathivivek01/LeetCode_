import java.util.*;

class Solution {
    public int countPartitions(int[] nums, int k) {

        int MOD = 1000000007;
        int n = nums.length;

        int[] dp = new int[n + 1];
        dp[0] = 1;  

        Deque<Integer> minQ = new ArrayDeque<>();
        Deque<Integer> maxQ = new ArrayDeque<>();

        long runningSum = 1;  
        int left = 0;

        for (int right = 0; right < n; right++) {

            while (!minQ.isEmpty() && nums[minQ.peekLast()] >= nums[right]) {
                minQ.pollLast();
            }
            minQ.addLast(right);
            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] <= nums[right]) {
                maxQ.pollLast();
            }
            maxQ.addLast(right);

            while (nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > k) {
                runningSum = (runningSum - dp[left] + MOD) % MOD;

                if (minQ.peekFirst() == left) minQ.pollFirst();
                if (maxQ.peekFirst() == left) maxQ.pollFirst();

                left++;
            }

            dp[right + 1] = (int) runningSum;

            runningSum = (runningSum + dp[right + 1]) % MOD;
        }

        return dp[n];
    }
}
