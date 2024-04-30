class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int cards1I = 0;
        int cards2I = 0;
        
        for (int i = 0; i < goal.length; i++) {
            
            if (cards1I < cards1.length && goal[i].equals(cards1[cards1I])) {
                cards1I++;
                continue;
            }
            
            if (cards2I < cards2.length && goal[i].equals(cards2[cards2I])) {
                cards2I++;
                continue;
            }
            
            answer = "No";
            return answer;
        }
        
        return answer;
    }
}