class Solution {

    public void markGuarded(int row,int col,int[][] arr){
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]==2 || arr[i][col]==3) break;
            arr[i][col] = 1;
        }
        for(int i=row+1;i<arr.length;i++){
            if(arr[i][col]==2 || arr[i][col]==3) break;
            arr[i][col] = 1;
        }
        for(int j=col-1;j>=0;j--){
            if(arr[row][j]==2 || arr[row][j]==3) break;
            arr[row][j] = 1;
        }
        for(int j=col+1;j<arr[0].length;j++){
            if(arr[row][j]==2 || arr[row][j]==3) break;
            arr[row][j] = 1;
        }

    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] arr =new int[m][n];
        for(int[] guard : guards){
            int i = guard[0];
            int j = guard[1];
            arr[i][j] = 2;
        }
        for(int[] wall : walls){
            int i = wall[0];
            int j = wall[1];
            arr[i][j] = 3;       
        }
        for(int[] guard : guards){
            int i = guard[0];
            int j = guard[1];
            markGuarded(i,j,arr);
        }
        
        int c = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0) c++;
            }
        }

        return c;
    }
}