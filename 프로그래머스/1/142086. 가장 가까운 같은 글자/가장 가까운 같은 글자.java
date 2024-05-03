import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] hi = s.toCharArray();

        for (int i = 0; i < hi.length; i++) {
            int prevIndex = index(Arrays.copyOfRange(hi, 0, i), hi[i]);
            if (prevIndex >= 0) answer[i] = i - prevIndex + 1;
            else answer[i] = prevIndex;
        }

        return answer;
    }

    public static int index(char[] hi, char target) {

        for (int i = hi.length; i > 0; i--) {
            if (hi[i - 1] == target) return i;
        }

        return -1;
    }
}