class Solution {
    public int minNumberOperations(int[] target) {
        int operations = target[0]; // first element requires target[0] increments
        for (int i = 1; i < target.length; i++) {
            if (target[i] > target[i - 1]) {
                operations += target[i] - target[i - 1];
            }
        }
        return operations;
    }
}
