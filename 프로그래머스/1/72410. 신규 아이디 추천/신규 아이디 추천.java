import java.util.*;

class Solution {
 public static String solution(String new_id) {
        List<Character> noMun = List.of('~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '=', '+', '[', '{', ']', '}', ':', '?', ',', '<', '>', '/');

        new_id = new_id.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (char c : new_id.toCharArray()) {
            if (!noMun.contains(c)) {
                sb.append(c);
            }
        }

        new_id = sb.toString();
        new_id = new_id.replaceAll("\\.{2,}", ".");

        if (new_id.length() >= 1) {
            if (new_id.charAt(0) == '.') {
                new_id = new_id.substring(1);
            }
        }

        if (new_id.length() >= 1) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        if (new_id.equals("")) {
            new_id = "a";
        }

        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        StringBuilder new_idBuilder = new StringBuilder(new_id);
        while (new_idBuilder.length() < 3) {
            new_idBuilder.append(new_idBuilder.charAt(new_idBuilder.length() - 1));
        }
        new_id = new_idBuilder.toString();

        return new_id;
    }
}