class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int i=0, end = matrix[0].length-1;
        int j = end;
        
        while(i<matrix.length && j>=0){
            
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target){
                i++;
                j=end;
            }
            else if(j<0) {
                i++;
                j=end;
            }
            else j--;
        }
        
        return false;
        
    }
}
