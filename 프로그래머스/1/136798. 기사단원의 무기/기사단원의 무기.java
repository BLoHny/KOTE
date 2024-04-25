import java.util.ArrayList;
import java.util.List;


class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> c = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            c.add(countDivisors(i));
        }

        for (Integer integer : c) {
            if (Integer.parseInt(String.valueOf(integer)) > limit) {
                answer++;
            }
        }

        return c.stream()
                .filter(s -> s <= limit)
                .mapToInt(Integer::intValue)
                .sum() + (power * answer);
    }
    
    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        return count;
    }
}