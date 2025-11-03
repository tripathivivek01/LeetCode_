class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int maxTime = neededTime[0];
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                if (neededTime[i] < maxTime) {
                    time += neededTime[i];
                } else {
                    time += maxTime;
                    maxTime = neededTime[i];
                }
            } else {
                maxTime = neededTime[i];
            }
        }
        return time;
    }
}
