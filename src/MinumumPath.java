public class MinumumPath {

    public static void main(String [] args){

        int [][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println((minPathSum(grid)));
    }

    /**
     * Dijkistra Algorithm
     * @param grid
     * @return
     */

    public static int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n] ; //another m*n array

        dp[0][0] = grid[0][0];

        //fill the edges
        for(int i = 1; i < n; i++)
            dp[0][i] = grid[0][i] + dp[0][i-1];
        for(int j = 1; j < m; j++)
            dp[j][0] = grid[j][0] + dp[j-1][0];

        //fill the remaining cells
        for(int i = 1; i < n; i++)
            for(int j = 1; j < m; j++)
                dp[j][i] = grid[j][i] + Math.min(dp[j-1][i],dp[j][i-1]);

        return dp[m-1][n-1];
    }
}
