class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet a=new HashSet();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    
                    if(!a.add("row"+i+board[i][j]) || !a.add("col"+j+board[i][j]) || !a.add("box"+(i/3)*3+j/3+board[i][j]))
                        return false;
                    
                }
            }
        }
        return true;
        
    }
}