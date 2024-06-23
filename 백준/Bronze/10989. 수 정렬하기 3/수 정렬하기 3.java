import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int start = Integer.parseInt(br.readLine());
        int[] hyewon = new int[start];
        
        for (int i = 0; i < start; i++) {
            hyewon[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(hyewon);
        StringBuilder sb = new StringBuilder();
        for (int zz : hyewon) {
            sb.append(zz).append('\n');
        }

        System.out.println(sb);
    }
}
