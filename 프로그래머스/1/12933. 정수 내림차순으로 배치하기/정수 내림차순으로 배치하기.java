import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] s = String.valueOf(n).split("");
        Arrays.sort(s, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String ss : s) {
            sb.append(ss);
        }
        return Long.parseLong(sb.toString());
    }
}