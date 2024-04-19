import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BitSet set = new BitSet(1 << 25);
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int len = st.countTokens();
        for (int i = len; i > 0; i--) {
            int num = Integer.parseInt(st.nextToken());
            if (!set.get(num)) {
                set.set(num);
                sb.append(num).append(' ');
            }
        }
        System.out.println(sb);
    }
}
