class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;      
        String x = "";     

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (x.indexOf(ch) != -1) {
                x = x.substring(x.indexOf(ch) + 1);
            }
            x += ch;
            if (x.length() > max) {
                max = x.length();
            }
        }

        return max;
    }
}
