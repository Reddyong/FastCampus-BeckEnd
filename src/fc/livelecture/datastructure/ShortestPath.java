package fc.livelecture.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
    int[] dx = new int[]{1, 0, -1, 0, 1, -1, -1, 1};
    int[] dy = new int[]{0, 1, 0, -1, 1, 1, -1, -1};
    boolean[][] visited;
    int n;
    int m;
    int answer;
    public int shortestPathBinaryMatrix(int[][] grid) {
        findShortestPath(grid);

        return answer;
    }

    private void findShortestPath(int[][] grid) {
        answer = -1;
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];

        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) {
            return;
        }

        bfs(0, 0, grid);
    }

    private void bfs(int r, int c, int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c, 1});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int depth = poll[2];

            if (poll[0] == n - 1 && poll[1] == m - 1) {
                answer = depth;
                break;
            }

            for (int i = 0; i < 8; i++) {
                int nx = poll[1] + dx[i];
                int ny = poll[0] + dy[i];

                if (isInBound(nx, ny, grid) && !visited[ny][nx]) {
                    queue.add(new int[]{ny, nx, depth + 1});
                    visited[ny][nx] = true;
                }
            }
        }
    }

    private boolean isInBound(int nx, int ny, int[][] grid) {
        if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
            return false;
        }

        if (grid[ny][nx] == 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ShortestPath sol = new ShortestPath();
        int solution1 = sol.shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}});
        int solution2 = sol.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}});
        int solution3 = sol.shortestPathBinaryMatrix(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
