import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int obj = 0;
        PriorityQueue<Integer> elems = new PriorityQueue<>();

        for (int i = 0; i < len; i++) {
            obj = sc.nextInt();
            if (obj != 0) {
                elems.add(obj);
            } else {
                if (!elems.isEmpty()) {
                    System.out.println(elems.poll());
                }
                else
                    System.out.println(0);
            }
        }

        sc.close();
    }
}
