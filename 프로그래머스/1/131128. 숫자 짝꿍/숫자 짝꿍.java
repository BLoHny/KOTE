import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (char ch : X.toCharArray()) {
            xCount[ch - '0']++;
        }

        for (char ch : Y.toCharArray()) {
            yCount[ch - '0']++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int minCount = Math.min(xCount[i], yCount[i]);
            if (minCount > 0) {
                result.append(String.valueOf(i).repeat(minCount));
            }
        }

        String rs = result.toString();

        if (rs.isEmpty()) {
            return "-1";
        }

        if (rs.charAt(0) == '0') {
            return "0";
        }

        return rs;
    }
}