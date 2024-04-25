import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        if (arr.length < 2) {
            return List.of(-1);
        }

        List<Integer> list = new ArrayList<>();
        for (int a: arr) {
            list.add(a);
        }

        int m = Collections.min(list);
        list.remove(Integer.valueOf(m));

        return list;
    }
}