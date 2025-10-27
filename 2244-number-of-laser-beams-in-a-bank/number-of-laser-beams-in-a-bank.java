class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;   // number of devices in previous non-empty row
        int total = 0;  // total beams

        for (String row : bank) {
            int curr = 0;
            // count '1's in this row
            for (char c : row.toCharArray()) {
                if (c == '1') curr++;
            }

            // if this row has devices
            if (curr > 0) {
                total += prev * curr;  // beams between this and previous non-empty row
                prev = curr;           // update previous
            }
        }

        return total;
    }
}