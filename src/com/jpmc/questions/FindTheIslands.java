package com.jpmc.questions;

/**
 * Find the number of islands (Using DFS or BFS)
 */

public class FindTheIslands {

    public int numOfIslands(char[][] grid){
        if(grid.length == 0 || grid == null)
            return 0;

        int numOfIslands = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[i].length; j++ ){
                if(grid[i][j] == 1){
                    numOfIslands = numOfIslands + dfs(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }

    private int dfs(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0)
            return 0;

        grid[i][j] = 0;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        return 1;
    }


    public static void main(String [] args) {
        char[][] grid = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        System.out.println(new FindTheIslands().numOfIslands(grid));
    }
}
