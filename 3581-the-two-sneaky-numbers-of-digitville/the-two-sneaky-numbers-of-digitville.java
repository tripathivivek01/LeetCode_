class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] count = new int[n]; 
        int[] result = new int[2];
        int x = 0;
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 0; i < n; i++) {
            if (count[i] == 2) {
                result[x++] = i;
            }
        }

        return result;
    }
}
