class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max_area = 0;

        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                if(grid[r][c] == 1) {
                    int area = dfs(grid, r, c);
                    max_area = Math.max(area, max_area);
                }
            }
        }

        return max_area;
    }

    public int dfs(int[][] grid, int i, int j) {
        // boundary check
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        // mark visited
        grid[i][j] = 0;

        int area = 1;

        area += dfs(grid, i+1, j); // down
        area += dfs(grid, i-1, j); // up
        area += dfs(grid, i, j+1); // right
        area += dfs(grid, i, j-1); // left

        return area;
    }
}