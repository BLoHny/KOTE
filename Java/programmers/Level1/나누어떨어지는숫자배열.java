package Java.programmers.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    class Solution {
        public List<Integer> solution(int[] arr, int divisor) {
            List<Integer> rs = new ArrayList<>();

            for (Integer integer : arr) {
                if (integer % divisor == 0) { rs.add(integer); }
            }
            Collections.sort(rs);

            return rs.size() == 0 ? List.of(-1) : rs;
        }
    }
}
