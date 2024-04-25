class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int s = 0;
        int r = p.length();

        while (s <= t.length() - p.length()) {
            String left = t.substring(s, r);
            if (Long.parseLong(left) <= Long.parseLong(p)) {
                answer++;
            }
            s++;
            r++;
        }

        return answer;
    }
}