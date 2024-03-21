package Java.backjoon.Silver;

import java.io.*;
import java.util.*;

class hi1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int su = Integer.parseInt(in.readLine());
        String[] map = new String[su];
        for (int i = 0; i < su; i++) {
            String j = in.readLine();
            map[i] = j;
        }

        for (int i = 1; i <= map[0].length(); i++) {
            Set<String> maps = new HashSet<>();
            for (int j = 0; j < su; j++) {
                String substring = map[j].substring(map[0].length() - i);
                maps.add(substring);
            }

            if (maps.size() == su) {
                System.out.println(i);
                return;
            }
        }
    }
}
