class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if (row * col != r * c)
            return mat;

        int[][] ans = new int[r][c];

        int[] temp = new int[row * col];
        int x = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[x++] = mat[i][j];
            }
        }
        x = 0;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                ans[i][j] = temp[x++];
            }
        }
        return ans;
    }
}
