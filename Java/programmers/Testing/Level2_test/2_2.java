package Java.programmers.Testing.Level2_test;

class Solution {

    public static void main(String[] args) {
        
        int[][] users = { {40, 10000}, {25, 10000} };
        int[] emoticons = {7000, 9000};


        int answer[] = solution(users, emoticons);
        System.out.println(answer);
    }

    public static int[] solution(int[][] users, int[] emoticons) {

        int sec_want_plus = 0;
        int no_plus_price = 0;

        int sec_user = users.length;

        int sec_emoticons = emoticons.length;

        for (int i = 0; i < sec_user; i++) {
            int one_user_price = 0;

            for (int j = 0; j < sec_emoticons; j++) {
                int sale = users[i][0];

                double discount = sale / 100.0;
                double discountedPrice = emoticons[j] * (1 - discount);

                one_user_price += (int) discountedPrice;
                no_plus_price += (int) discountedPrice;

                if (one_user_price >= users[i][1]) {
                    sec_want_plus++;
                    no_plus_price = 0;
                    continue;
                }
            }
        }

        int[] answer = new int[2];

        answer[0] = sec_want_plus;
        answer[1] = no_plus_price;

        return answer;
    }
}