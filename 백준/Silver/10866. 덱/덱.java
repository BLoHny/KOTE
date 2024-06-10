import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int MAX = 10000;
    static int FRONT = 10000;
    static int BACK = 10000;
    static int[] hyewon = new int[MAX * 2 + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    pop_front();
                    break;

                case "pop_back":
                    pop_back();
                    break;

                case "size":
                    System.out.println(size());
                    break;

                case "empty":
                    empty();
                    break;

                case "front":
                    front();
                    break;

                case "back":
                    back();
                    break;
            }
        }
    }

    static void push_front(int x) {
        hyewon[--FRONT] = x;
    }

    static void push_back(int x) {
        hyewon[BACK++] = x;
    }

    static void pop_front() {
        if (size() == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(hyewon[FRONT]);
        hyewon[FRONT] = 0;
        FRONT++;
    }

    static void pop_back() {
        if (size() == 0) {
            System.out.println(-1);
            return;
        }

        BACK--;
        System.out.println(hyewon[BACK]);
        hyewon[BACK] = 0;
    }

    static int size() {
        return BACK - FRONT;
    }

    static void empty() {
        if (size() != 0) System.out.println(0);
        else System.out.println(1);
    }

    static void front() {
        if (size() != 0) System.out.println(hyewon[FRONT]);
        else System.out.println(-1);
    }

    static void back() {
        if (size() != 0) System.out.println(hyewon[BACK - 1]);
        else System.out.println(-1);
    }
}
