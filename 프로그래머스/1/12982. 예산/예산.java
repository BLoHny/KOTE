import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int rs = 0;
        
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            rs += d[i];
            if (rs > budget) {
                rs -= d[i];
                return answer;
            }
            answer++;
        }   
        
        return answer;
    }
}