package Java.programmers.Level1;

import java.util.Arrays;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int currentIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                answer[currentIndex] = arr[i];
                currentIndex++;
            }
        }

        return Arrays.copyOf(answer, currentIndex);
    }
}
