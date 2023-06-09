package Java.backjoon.Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[][] result = new Integer[8][2];

        for (int i = 0; i < result.length; i++) {
            result[i][0] = sc.nextInt();
            result[i][1] = i + 1;
        }

        Arrays.sort(result, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o2[0].compareTo(o1[0]);
            }
        });

        int want = 0;

        Integer[] operate = new Integer[5];

        Integer[] op_result = new Integer[5];

        for (int i = 0; i < 5; i++) {
            want += result[i][0];
            operate[i] = result[i][0];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < result.length; j++) {
                if (operate[i] == result[j][0]) {
                    op_result[i] = result[j][1];
                }
            }
        }

        Arrays.sort(op_result);

        System.out.println(want);
        System.out.println(op_result[0] + " " +
                           op_result[1] + " " +
                           op_result[2] + " " +
                           op_result[3] + " " +
                           op_result[4]);
        sc.close();
    }
}