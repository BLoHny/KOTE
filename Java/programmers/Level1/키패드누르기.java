package Java.programmers.Level1;

public class 키패드누르기 {
    static String[][] key = new String[3][4];

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10, right = 12;
        for (int num : numbers) {
            if (num == 0) num = 11;
            switch (num % 3) {
                case 0 -> { 
                    answer.append("R");
                    right = num;
                }
                case 1 -> {
                    answer.append("L");
                    left = num;
                }
                case 2 -> {
                    int leftDifference = Math.abs(num - left);
                    int rightDifference = Math.abs(num - right);
                    char handChoice = (leftDifference < rightDifference) ? 'L' : ((rightDifference < leftDifference) ? 'R' : (hand.equals("right") ? 'R' : 'L'));
                    answer.append(handChoice);
                    if (handChoice == 'L') {
                        left = num;
                    } else {
                        right = num;
                    }
                }                
            }
        }
        return answer.toString();
    }
}