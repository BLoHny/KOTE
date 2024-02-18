import java.util.*;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        int[] i = new int[]{1, 3, 4, 6};
        System.out.println(solution(i));
    }

    public static String solution(int[] food) {
        String answer = "";
        Map<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < food.length; i++) {
            if (i != 0 && food[i] != 1) {
                list.put(i, food[i]);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = list.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer f_n = entry.getKey();
            Integer f_c = entry.getValue();
            
            for (int i = 0; i < f_c / 2; i++) {
                answer += String.valueOf(f_n);
            }
        }

        String reverse = new StringBuilder(answer).reverse().toString();
        return answer + "0" + reverse;
    }
}
