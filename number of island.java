class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int R = grid.length;
        int C = grid[0].length; // Fixed: Ensuring correct column length lookup
        int islands = 0;

        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (grid[row][col] == '1') {
                    islands++;
                    dfs(grid, row, col, R, C);
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int row, int col, int R, int C) {
        // Sink the current land piece immediately
        grid[row][col] = '0';

        // Pruning: Only invoke recursion if the neighbor is valid and is land ('1')
        if (row + 1 < R && grid[row + 1][col] == '1') {
            dfs(grid, row + 1, col, R, C);
        }
        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
            dfs(grid, row - 1, col, R, C);
        }
        if (col + 1 < C && grid[row][col + 1] == '1') {
            dfs(grid, row, col + 1, R, C);
        }
        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
            dfs(grid, row, col - 1, R, C);
        }
    }
}
