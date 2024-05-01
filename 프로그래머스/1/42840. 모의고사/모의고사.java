import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] one = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int one1 = 0;
        int two1 = 0;
        int three1 = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) one1++;
            if (answers[i] == two[i % two.length]) two1++;
            if (answers[i] == three[i % three.length]) three1++;
        }
        map.put(1, one1);
        map.put(2, two1);
        map.put(3, three1);


        List<Integer> maxKeys = new ArrayList<>();

        int maxValue = map.values().stream().max(Integer::compare).orElse(0);
        if (maxValue != 0) {
            map.forEach((key, value) -> {
                if (value == maxValue) {
                    maxKeys.add(key);
                }
            });
        } else return new int[]{1, 2, 3};

        answer = new int[maxKeys.size()];
        int p = 0;
        for (int k : maxKeys) {
            answer[p] = k;
            p++;
        }

        return answer;
    }
}