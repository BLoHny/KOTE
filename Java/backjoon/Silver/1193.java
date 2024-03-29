package Java.backjoon.Silver;

import java.util.Scanner;

class hi1193 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int want = sc.nextInt();
        int line_count = 1;
        int prev_count_sum = 0;

        while(true) {

            // 2 2 1        

            if (want <= prev_count_sum + line_count) {

                if(line_count % 2 == 1) {
                    System.out.println((line_count - (want - prev_count_sum - 1)) +  "/" + (want - prev_count_sum));
                    break;
                }
                else {
                    System.out.println((want - prev_count_sum) + "/" + (line_count - (want - prev_count_sum - 1)));
                    break;
                }
            }
            else {
                prev_count_sum += line_count;
                line_count++;
            }
        }
        
        sc.close();
    }
}