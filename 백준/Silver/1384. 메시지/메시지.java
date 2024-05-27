import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int groupNumber = 1;

        while (true) {
            int c = Integer.parseInt(br.readLine());
            if (c == 0) break;

            ArrayList<String> names = new ArrayList<>();
            ArrayList<String[]> messages = new ArrayList<>();

            for (int i = 0; i < c; i++) {
                String s = br.readLine();
                String[] parts = s.split(" ", 2);
                names.add(parts[0]);
                messages.add(parts[1].split(" "));
            }

            ArrayList<String> ns = new ArrayList<>();

            for (int i = 0; i < c; i++) {
                String[] p = messages.get(i);
                for (int j = 0; j < p.length; j++) {
                    if (p[j].equals("N")) {
                        String from = names.get(i);
                        String to = names.get((i - j + c - 1) % c);
                        ns.add(to + " was nasty about " + from);
                    }
                }
            }

            System.out.println("Group " + groupNumber);

            if (ns.isEmpty())
                System.out.println("Nobody was nasty");
            else {
                for (String nasty : ns) {
                    System.out.println(nasty);
                }
            }

            groupNumber++;
            System.out.println();
        }
    }
}
