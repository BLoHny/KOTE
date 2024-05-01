import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> hi = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hi.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> rs = hi.stream().sorted().collect(Collectors.toList());
        int[] answer = new int[rs.size()];
        for (int i = 0; i < rs.size(); i++) {
            answer[i] = rs.get(i);
        }

        return answer;
    }
}