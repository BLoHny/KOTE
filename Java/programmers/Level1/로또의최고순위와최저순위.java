

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};

        int[] number = solution(lottos, win_nums);

        for (int i : number) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int zero_count = 0;

        int lotto_count = 0;

        int ary_length = win_nums.length;

        if(lottos[0] == 0 && 
           lottos[1] == 0 && 
           lottos[2] == 0 && 
           lottos[3] == 0 && 
           lottos[4] == 0 && 
           lottos[5] == 0
        ){
            answer[0] = 1;
            answer[1] = 6;
            return answer;
        }

        for (int i = 0; i < ary_length; i++) {
            if (lottos[i] == 0) {
                zero_count++;
            }
        }

        for (int i = 0; i < ary_length; i++ ){
            for (int j = 0; j < ary_length; j++) {
                if(win_nums[j] == lottos[i]) {
                    lottos[i] = 0;
                    lotto_count++;
                    continue;
                }
            }
        }

        int rs = lotto_count + zero_count;

        if (zero_count == 0 && lotto_count == 0) {
            answer[0] = 6;
            answer[1] = answer[0];
            return answer;
        }

        for (int i = 6; i >= 1; i--) {
            if (rs == i) {
                answer[0] = 7 - i;
            }

            if (lotto_count == i) {
                answer[1] = 7 - i;
            }
        }
        return answer;
    }
}