package Java.programmers.Level1;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer t : nums) {
            set.add(t);
        }

        return set.size() > nums.length/2 ? nums.length/2 : set.size();
    }
}
