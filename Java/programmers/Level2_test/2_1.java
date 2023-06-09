package Java.programmers.Level2_test;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        
        int answer[] = solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");

        System.out.println(answer);
    }

    public static int[] solution(String s) {
        s = s.replace("{", "").replace("}", "");

        String[] tupleStrings = s.split(",");

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (String tupleString : tupleStrings) {
            int num = Integer.parseInt(tupleString);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedTuple = new ArrayList<>(freqMap.keySet());
        sortedTuple.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

        int[] answer = new int[sortedTuple.size()];
        int index = 0;
        for (int num : sortedTuple) {
            answer[index++] = num;
        }

        return answer;
    }
}
