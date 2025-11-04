import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int max = 0;
        for (int num : nums) {
            if (num > max) max = num;
        }

        for (int i = 0; i <= n - k; i++) {
            int[] freq = new int[max + 1];
            for (int j = i; j < i + k; j++) {
                freq[nums[j]]++;
            }
            int sum = 0;
            for (int count = 0; count < x; count++) {
                int Num = -1;
                int Freq = 0;

                for (int num = 0; num <= max; num++) {
                    if (freq[num] > Freq || 
                       (freq[num] == Freq && num > Num)) {
                        Freq = freq[num];
                        Num = num;
                    }
                }

                if (Freq == 0) break; 
                sum += Num * Freq;
                freq[Num] = 0; 
            }

            ans[i] = sum;
        }

        return ans;
    }
}
