package fc.livelecture.datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NumberOfIslands {
    int[] dx = new int[]{1, 0, -1, 0};
    int[] dy = new int[]{0, 1, 0, -1};
    boolean[][] visited;
    int n;
    int m;
    int answer;
    public int numIslands(char[][] grid) {

        totalIslandNum(grid);

        return answer;
    }

    private void totalIslandNum(char[][] grid) {
        answer = 0;
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    bfs(i, j, grid);
                    answer++;
                }
            }
        }

    }

    private void bfs(int r, int c, char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll[1] + dx[i];
                int ny = poll[0] + dy[i];

                if (isInBound(nx, ny, grid) && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    queue.add(new int[]{ny, nx});
                }
            }
        }
    }

    private boolean isInBound(int nx, int ny, char[][] grid) {
        if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
            return false;
        }

        if (grid[ny][nx] == '0') {
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        NumberOfIslands sol = new NumberOfIslands();
        int solution1 = sol.numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}});
        int solution2 = sol.numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
