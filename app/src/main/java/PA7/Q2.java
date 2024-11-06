package PA7;
public class Q2 {
/*
-Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
-An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
-You may assume all four edges of the grid are all surrounded by water. */

    public int numberOfIslands(char[][] grid) {
        // Check if the grid is null
        if (grid == null) {
            return 0; // No islands if the grid is null
        }

        //Check if the grid is empty (has no rows)
        if (grid.length == 0)
            return 0;
        
        int numIslands = 0;

        //Iterate over each row in the grid
        for (int i = 0; i < grid.length; i++) {
            //Iterate over each column in the current row
            for (int j = 0; j < grid[0].length; j++) {
                //Check if the current cell is land ('1')
                if (grid[i][j] == '1') {
                    //DFS to mark the entire island as visited
                    dfs(grid, i, j);
                    numIslands = numIslands + 1; // More explicit increment
                }
            }
        }

        return numIslands;
    }

    // Helper method for Depth-First Search (DFS)
    private void dfs(char[][] grid, int i, int j) {
        // Check if the current row index is out of bounds
        if (i < 0)
            return;

        // Check if the current row index is out of bounds on the bottom
        if (i >= grid.length) 
            return;
    
        // Check if the current column index is out of bounds on the left
        if (j < 0) 
            return;

        // Check if the current column index is out of bounds on the right
        if (j >= grid[0].length)
            return; 
        
        //Check if the current cell is water ('0')
        if (grid[i][j] == '0') 
            return; // Current cell is water, exit DFS
        
        // Mark the current cell as visited by changing '1' to '0'
        grid[i][j] = '0'; 

        // Recursively visit all adjacent cells
        //above
        dfs(grid, i - 1, j);

        //below
        dfs(grid, i + 1, j);

        //left
        dfs(grid, i, j - 1);

        //right
        dfs(grid, i, j + 1);
    }
    public void printGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();

        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '1'},
            {'0', '0', '0', '1', '1'},
            {'0', '0', '0', '0', '0'}
        };

        System.out.println("Grid:");
        q2.printGrid(grid);

        int numberOfIslands = q2.numberOfIslands(grid);
        System.out.println("Number of islands: " + numberOfIslands);
    }
}