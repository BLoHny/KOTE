class Solution {
    public int solution(String s) {
        char first = '0';
        int same = 0, diff = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (same == diff) {
                result++;
                first = s.charAt(i);
            }
            
            if (s.charAt(i) == first) same++;
            else diff++;
        }
        
        return result;
    }
}