class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);
        int n = nums.length;

        int x = 0;
        int y = 0;
        int sumCount = 0;
        int result = 0;
        int z = 0;
        int sumCount2 = 0;
        int count = 0;
        int prev = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num == prev) {
                count++;
            } else {
                prev = num;
                count = 1;
            }

            while (nums[x] < num - k) {
                sumCount--;
                x++;
            }

            while (y < n && nums[y] <= num + k) {
                sumCount++;
                y++;
            }
            result = Math.max(result, count + Math.min(sumCount - count, numOperations));

            sumCount2++;
            while (nums[z] < num - 2L * k) {
                sumCount2--;
                z++;
            }
            result = Math.max(result, Math.min(sumCount2, numOperations));
        }

        return result;
    }
}