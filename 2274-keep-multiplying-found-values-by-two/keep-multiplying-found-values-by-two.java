class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            boolean found =false;
            for(int x:nums){
                if(x== original){
                    found = true;
                    original =original*2;
                    break;
                }
            }
            if(!found){
                break;
            }
        }
        return original;
    }
}