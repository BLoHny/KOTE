import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(st.nextToken());
            }
            getArea(b);
        }
    }

    private static void getArea(long[] heights) {
        long hyewon = 0;
        int i = 0;
        Stack<Integer> stack = new Stack<>();

        while (i < heights.length) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                long max = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                hyewon = Math.max(max, hyewon);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            long max = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            hyewon = Math.max(max, hyewon);
        }

        System.out.println(hyewon);
    }
}
