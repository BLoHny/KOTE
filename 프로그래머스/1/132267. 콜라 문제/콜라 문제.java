class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int nam = 0;
        
        while (n >= a) {
            int hi = (n / a) * b;
            answer += hi;
            nam = n % a;
            n = hi + nam;
        }
        
        return answer;
    }
}