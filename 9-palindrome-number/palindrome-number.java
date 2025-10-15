class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int n = 0;
        while (x != 0) {
            int y = x % 10;        
            n = n * 10 + y;  
            x = x / 10;         
        }
        return num == n;
    }
}
