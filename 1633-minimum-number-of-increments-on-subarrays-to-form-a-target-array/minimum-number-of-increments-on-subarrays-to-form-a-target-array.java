class Solution {
    public int minNumberOperations(int[] target) {
        int operation = target[0];
        for (int i = 1; i < target.length; i++)
            operation += Math.max(0, target[i] - target[i - 1]);
        return operation;
    }
}
