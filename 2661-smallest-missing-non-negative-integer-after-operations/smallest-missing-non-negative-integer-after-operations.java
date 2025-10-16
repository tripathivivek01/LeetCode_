class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] y=new int[value];
        for (int num:nums){
            int remainder =((num % value )+value)%value;
            y[remainder]++;
        }
        int max =0;
        while(true){
            int remainder =max%value;
           if (y[remainder] == 0) {
                return max;
            }
            y[remainder]--;
            max++;
        }
    }
}