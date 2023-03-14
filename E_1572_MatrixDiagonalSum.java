class Solution {
    public int diagonalSum(int[][] mat) {
        int ret = 0;
        for (int i=0; i<mat.length; i++) {
            ret += mat[i][i]; 
            ret += mat[mat.length-1-i][i]; 
        }
        return (mat.length%2==0) ? ret : ret-mat[mat.length/2][mat.length/2]; 
    }
}