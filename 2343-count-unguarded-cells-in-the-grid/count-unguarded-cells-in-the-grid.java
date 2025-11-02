class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] g : guards) grid[g[0]][g[1]] = 1;
        for (int[] w : walls) grid[w[0]][w[1]] = 2;
        for (int i = 0; i < m; i++) {
            boolean seen = false;
            for (int j = 0; j < n; j++) { 
                if (grid[i][j] == 1) seen = true;
                else if (grid[i][j] == 2) seen = false;
                else if (seen) grid[i][j] = 3;
            }

            seen = false;
            for (int j = n - 1; j >= 0; j--) { 
                if (grid[i][j] == 1) seen = true;
                else if (grid[i][j] == 2) seen = false;
                else if (seen) grid[i][j] = 3;
            }
        }
        for (int j = 0; j < n; j++) {
            boolean seen = false;
            for (int i = 0; i < m; i++) { 
                if (grid[i][j] == 1) seen = true;
                else if (grid[i][j] == 2) seen = false;
                else if (seen) grid[i][j] = 3;
            }

            seen = false;
            for (int i = m - 1; i >= 0; i--) { 
                if (grid[i][j] == 1) seen = true;
                else if (grid[i][j] == 2) seen = false;
                else if (seen) grid[i][j] = 3;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0)
                    count++;

        return count;
    }
}
