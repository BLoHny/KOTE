import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Queue<Jihun> jihun = new LinkedList<>();
        Queue<Fire> fire = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[][] hyewon = new String[y][x];
        int[][] fires = new int[y][x];
        boolean[][] visited = new boolean[y][x];
        int[] dy = new int[]{-1, 1, 0, 0};
        int[] dx = new int[]{0, 0, -1, 1};

            for (int i = 0; i < y; i++) {
                String[]si = br.readLine().split("");

                for (int j = 0; j < x; j++) {
                    String to = si[j];
                    hyewon[i][j] = to;

                    if (to.equals("J")) {
                        jihun.add(new Jihun(j, i, 1));
                        visited[i][j] = true;
                    }

                    if (to.equals("F")) {
                        fire.add(new Fire(j, i));
                        fires[i][j] = 1;
                    }
                }
            }


        try {
            while (!fire.isEmpty()) {
                var current = fire.poll();
                for (int i = 0; i < 4; i++) {
                    int newX = current.x + dx[i];
                    int newY = current.y + dy[i];

                    if (newX < 0 || newX >= x || newY < 0 || newY >= y) continue;

                    if (hyewon[newY][newX].equals(".") && fires[newY][newX] == 0) {
                        fires[newY][newX] = fires[current.y][current.x] + 1;
                        fire.add(new Fire(newX, newY));
                    }
                }
            }
        }
        catch (NullPointerException npe) {
            throw new FileNotFoundException();
        }

        try {
            while (!jihun.isEmpty()) {
                var current = jihun.poll();
                for (int i = 0; i < 4; i++) {
                    int newX = current.x + dx[i];
                    int newY = current.y + dy[i];

                    if (newX < 0 || newX >= x || newY < 0 || newY >= y) {
                        System.out.println(current.count);
                        return;
                    }

                    if (hyewon[newY][newX].equals(".") && (fires[newY][newX] == 0 || fires[newY][newX] > current.count + 1) && !visited[newY][newX]) {
                        visited[newY][newX] = true;
                        jihun.add(new Jihun(newX, newY, current.count + 1));
                    }
                }
            }
        }
        catch (NullPointerException npe) {
            throw new NotActiveException();
        }

        System.out.println("IMPOSSIBLE");
    }

    static class Jihun {
        int x;
        int y;
        int count;

        public Jihun (int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    static class Fire {
        int x;
        int y;

        public Fire(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
