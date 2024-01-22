package Java.backjoon.Silver;

import java.util.Scanner;

class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            arr[num == 6 ? 9 : num]++;
        }
        
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max,arr[i]);
        }
        
        max = Math.max(max, (arr[9] + 1) / 2);
        System.out.print(max);
    }
}
