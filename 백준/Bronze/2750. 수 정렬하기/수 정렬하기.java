import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine();
        int[] hyewon = new int[Integer.parseInt(start)];
        for (int i = 0; i < Integer.parseInt(start); i++) {
            hyewon[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < hyewon.length; i++) {
            for (int j = 0; j < hyewon.length - i - 1; j++) {
                if (hyewon[j] > hyewon[j + 1]) {
                    int temp = hyewon[j];
                    hyewon[j] = hyewon[j + 1];
                    hyewon[j + 1] = temp;
                }
            }
        }

        for (int zz : hyewon) {
            System.out.println(zz);
        };
    }
}
