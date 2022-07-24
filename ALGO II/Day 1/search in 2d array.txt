class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                    c++;
                
                
}
        }
       
        if(c!=0)
            return true;
        else
            return false;
    }
}