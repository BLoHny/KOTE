class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i = 0;
        for (int n : absolutes) {
            if (signs[i]) {
                answer += n;
            } else answer -= n;
            i++;
        }
        return answer;
    }
}