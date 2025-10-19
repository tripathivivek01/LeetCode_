class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        String y = s;
        int n = s.length();
        int rot = 0;
        do {
            String rotated = rotateRight(s, rot);

            for (int j = 0; j < 10; j++) {
                String t = addOddPositions(rotated, (a * j) % 10);

                if (b % 2 == 1) {
                    for (int addEven = 0; addEven < 10; addEven++) {
                        String t2 = addEvenPositions(t, (a * addEven) % 10);
                        if (t2.compareTo(y) < 0) y = t2;
                    }
                } else {
                    if (t.compareTo(y) < 0) y = t;
                }
            }

            rot = (rot + b) % n;
        } while (rot != 0);

        return y;
    }

    private String rotateRight(String s, int k) {
        int n = s.length();
        if (k % n == 0) return s;
        k = k % n;
        return s.substring(n - k) + s.substring(0, n - k);
    }

    private String addOddPositions(String s, int val) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            int digit = (arr[i] - '0' + val) % 10;
            arr[i] = (char) (digit + '0');
        }
        return new String(arr);
    }

    private String addEvenPositions(String s, int val) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2) {
            int digit = (arr[i] - '0' + val) % 10;
            arr[i] = (char) (digit + '0');
        }
        return new String(arr);
    }
}
