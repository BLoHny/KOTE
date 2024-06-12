import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] hyewon = new int[100001];

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        q.add(N);

        while (!q.isEmpty()) {
            var rs = q.poll();

            if (rs == K) break;

            for (int r : new int[]{rs - 1, rs + 1, rs * 2}) {
                if (r < 0 || r >= hyewon.length || hyewon[r] > 0) continue;
                hyewon[r] = hyewon[rs] + 1;
                q.add(r);
            }
        }

        System.out.println(hyewon[K]);
    }
}
