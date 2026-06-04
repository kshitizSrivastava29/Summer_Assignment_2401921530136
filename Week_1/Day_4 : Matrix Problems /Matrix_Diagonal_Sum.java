class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;

        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == j)ans += mat[i][j];
                if(i + j == n-1 )ans += mat[i][j];
            }
        }


        if(n % 2 != 0 )ans -= mat[n/2][n/2];

        return ans;
