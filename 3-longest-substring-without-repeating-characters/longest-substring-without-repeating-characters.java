class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] x = new int[256]; 
        for (int i = 0; i < 256; i++) {
            x[i] = -1; 
        }

        int left = 0;
        int max = 0;
         for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (x[ch] >= left) {
                left = x[ch] + 1;
            }

            x[ch] = right; 
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
