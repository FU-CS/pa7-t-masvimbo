package PA7;

public class Q3 {
    /* You are given a matrix grid where grid[i] is either a 0 (representing water) or 1 (representing land).
     - An island is defined as a group of 1's connected horizontally or vertically. 
     - You may assume all four edges of the grid are surrounded by water.
     - The area of an island is defined as the number of cells within the island.
     - Return the maximum area of an island in grid. If no island exists, return 0. */

    public int maxAreaOfIsland(char[][] grid) {
        // Check if the grid is null
        if (grid == null) {
            return 0;
        }

        // Check if the grid is empty (has no rows)
        if (grid.length == 0) {
            return 0;
        }

        int maxarea = 0;

        // Iterate over each row in the grid
        for (int i = 0; i < grid.length; i++) {
            // Iterate over each column in the current row
            for (int j = 0; j < grid[i].length; j++) {
                // Check if the current cell is land ('1')
                if (grid[i][j] == '1') {
                    // Perform DFS to calculate the area of the current island
                    int area = dfs(grid, i, j);
                    // Update maxarea if the current island's area is larger
                    maxarea = Math.max(maxarea, area);
                }
            }
        }

        return maxarea;
    }

    // Helper method for Depth-First Search (DFS)
    private int dfs(char[][] grid, int i, int j) {
        // Check if the current row index is out of bounds
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0; // Out of bounds, return 0
        }

        // Check if the current cell is water ('0')
        if (grid[i][j] == '0') {
            return 0; // Current cell is water, exit DFS
        }

        // Mark the current cell as visited by changing '1' to '0'
        grid[i][j] = '0';

        // Start counting area from this cell
        int area = 1;

        // Recursively visit all adjacent cells and add their areas
        area += dfs(grid, i - 1, j); // above
        area += dfs(grid, i + 1, j); // below
        area += dfs(grid, i, j - 1); // left
        area += dfs(grid, i, j + 1); // right

        return area;
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
        Q3 q3 = new Q3();

        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '1'},
            {'0', '0', '0', '1', '1'},
            {'0', '0', '0', '0', '0'}
        };

        System.out.println("Grid:");
        q3.printGrid(grid);

        int maxarea = q3.maxAreaOfIsland(grid);
        System.out.println("Maximum Area: " + maxarea);
    }
}
