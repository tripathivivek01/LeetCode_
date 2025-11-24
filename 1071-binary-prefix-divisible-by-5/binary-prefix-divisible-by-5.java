class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int mod = 0;

        for(int bit : nums) {
            mod = (mod * 2 + bit) % 5;   // update mod
            ans.add(mod == 0);          // divisible by 5?
        }

        return ans;
    }
}
