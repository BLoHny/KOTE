import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.PriorityQueue;

public class Main {
    public PriorityQueue<Integer> numbers = new PriorityQueue<>();
    public int totalSum = 0;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            main.numbers.add(Integer.valueOf(br.readLine()));
        }

        while (main.numbers.size() > 1) {
            int x = main.numbers.poll();
            int y = Optional.ofNullable(main.numbers.poll()).orElse(0);

            main.totalSum += x + y;
            main.numbers.add(x + y);
        }

        System.out.println(main.totalSum);
        br.close();
    }
}
