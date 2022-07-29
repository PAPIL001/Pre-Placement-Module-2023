class Solution {
    int[][] directions = {{0,1}, {1, 0}, {0, -1}, {-1,0}};
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = 2;
        int dirextionIndex = 0;
        
        int row = 0;
        int col = 0;
        res[0][0] = 1;
        
        while(count <= n*n){
            int newRow = row + directions[dirextionIndex][0];
            int newCol = col + directions[dirextionIndex][1];
            
            if(isValid(res, newRow, newCol)){
                res[newRow][newCol] = count;
                count++;
                row = newRow;
                col = newCol;
            }else {
                dirextionIndex = (dirextionIndex+1)%4;
            }
        }
        return res;
    }
        private boolean isValid(int[][] res, int row, int col) {
            if(row < res.length && row >= 0 && col < res[0].length && col >= 0 && res[row][col] == 0)
                return true;
            return false;
        }
}