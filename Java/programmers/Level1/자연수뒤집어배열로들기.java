public class 자연수뒤집어배열로들기 {
    public static void main(String[] args) {
        
        for (int hi : solution(5432235)) {
            System.out.print(hi );
        }
    }

    public static int[] solution(long n) {
        String[] digits = Long.toString(n).split("");
        int[] answer = new int[digits.length];

        for (int i = digits.length - 1; i >= 0; i--) {
            answer[digits.length - i - 1] = Integer.parseInt(digits[i]);
        }

        return answer;
    }
}
