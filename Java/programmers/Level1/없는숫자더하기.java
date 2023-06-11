public class 없는숫자더하기 {
    public static void main(String[] args) {

        int[] number = {5,8,4,0,6,7,9};
        
        System.out.println(solution(number));
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        int[] rs = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            rs[numbers[i]] = 1;
        }

        for (int i = 0; i < rs.length; i++) {
            if(rs[i] == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
