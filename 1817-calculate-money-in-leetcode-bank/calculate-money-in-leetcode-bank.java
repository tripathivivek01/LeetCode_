class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int Start = 1; 
        for (int day = 1; day <= n; day++) {
            total += Start + (day - 1) % 7;
            if (day % 7 == 0) {
                Start++;
            }
        }

        return total;
    }
}
