public class 콜라츠추측 {
    public static void main(String[] args) {
        
        System.out.println(solution(626331));
    }

    public static long solution(long num) {
        long answer = 0;

        long rs = num;

        if(rs == 1) {
            return answer;
        }

        while(true) {

            if (rs % 2 != 0) {
                rs = rs * 3 + 1;
                answer++;
            } else {
                rs /= 2;
                answer++;
            }

            if (rs == 1) {
                break;
            }

            if(answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
