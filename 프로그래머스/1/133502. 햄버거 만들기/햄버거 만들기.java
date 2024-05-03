import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        List<Integer> hyewon = new ArrayList<>();

        for (int i : ingredient) {
            hyewon.add(i);

            while (hyewon.size() >= 4) {
                int s = hyewon.size();

                if (!(hyewon.get(s - 1) == 1
                        && hyewon.get(s - 2)==3
                        && hyewon.get(s - 3) ==2
                        && hyewon.get(s - 4)==1)) break;

                for (int j = 0; j < 4; j++) {
                    hyewon.remove(hyewon.size() -1);
                }
                answer++;
            }
        }

        return answer;
    }
}