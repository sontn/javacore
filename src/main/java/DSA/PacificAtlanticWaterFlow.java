package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {

    private int[][] dirs = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
    };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Pacific
        for (int r = 0; r < m; r++) {
            dfs(r, 0, heights, pacific);
        }

        for (int c = 0; c < n; c++) {
            dfs(0, c, heights, pacific);
        }

        // Atlantic
        for (int r = 0; r < m; r++) {
            dfs(r, n -1, heights, atlantic);
        }

        for (int c = 0; c < n; c++) {
            dfs(m - 1, c, heights, atlantic);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(Arrays.asList(r,c));
                }
            }
        }
        return  result;
    }

    private void dfs(int r, int c, int[][] heights, boolean[][] visited) {
        if(visited[r][c]) return;

        visited[r][c] = true;

        int m = heights.length;
        int n = heights[0].length;

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                continue;
            }

            // Di nguoc chieu nuoc
            if (heights[nr][nc] >= heights[r][c]) {
                dfs(nr,nc, heights, visited);
            }
        }
    }
}
