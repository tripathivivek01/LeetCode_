class Solution {
    public int nextBeautifulNumber(int n) {
        int current = n + 1;
        
        while (true) {
            if (isBalanced(current)) {
                return current;
            }
            current++;
        }
    }
    private boolean isBalanced(int num) {
        String s = Integer.toString(num);
        int[] count = new int[10];
        for (char ch : s.toCharArray()) {
            count[ch - '0']++;
        }
        for (char ch : s.toCharArray()) {
            int digit = ch - '0';
            if (count[digit] != digit) {
                return false;
            }
        }
        
        return true;
    }
}
