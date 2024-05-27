import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        System.out.println(hyewon(N));
        sc.close();
    }

    public static long hyewon(long N) {
        long a = 1;
        int cnt = 1;
        if (N % 2 == 0 || N % 5 == 0) return -1;

        while (true) {
            if (a % N == 0) {
                return cnt;
            }

            a = (a * 10 + 1) % N;
            cnt++;
        }
    }
}
