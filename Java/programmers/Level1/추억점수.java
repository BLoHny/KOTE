import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
            {"may", "kein", "kain", "radi"}, 
            {"may", "kein", "brin", "deny"},  
            {"kon", "kain", "may", "coni"}
        };

        System.out.println(solution(name, yearning, photo));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> nameYearningMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            nameYearningMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int max = 0;

            for (int j = 0; j < photo[i].length; j++) {
                String currentName = photo[i][j];

                if (nameYearningMap.containsKey(currentName)) {
                    max += nameYearningMap.get(currentName);
                }
            }

            answer[i] = max;
        }

        return answer;
    }
}
