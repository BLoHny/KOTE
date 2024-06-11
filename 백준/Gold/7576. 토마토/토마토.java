import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Queue<C> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[][] grid = new int[y][x];
        int[] dy = new int[]{-1, 1, 0, 0};
        int[] dx = new int[]{0, 0, -1, 1};
        int totalCells = x * y;
        int emptyCells = 0;

        for (int i = 0; i < y; i++) {
            StringTokenizer si = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < x; j++) {
                int value = Integer.parseInt(si.nextToken());
                grid[i][j] = value;
                if (value == 1) {
                    queue.add(new C(i, j, 0));
                } else if (value == -1) {
                    emptyCells++;
                }
            }
        }

        int requiredTomatoes = totalCells - emptyCells;
        int ripenedTomatoes = queue.size();
        int days = 0;

        while (!queue.isEmpty()) {
            C current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (isInBounds(grid, newX, newY) && grid[newX][newY] == 0) {
                    grid[newX][newY] = 1;
                    queue.add(new C(newX, newY, current.count + 1));
                    ripenedTomatoes++;
                    days = current.count + 1;
                }
            }
        }

        if (ripenedTomatoes == requiredTomatoes) {
            System.out.println(days);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isInBounds(int[][] grid, int x, int y) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
    }

    static class C {
        int x;
        int y;
        int count;

        public C (int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
