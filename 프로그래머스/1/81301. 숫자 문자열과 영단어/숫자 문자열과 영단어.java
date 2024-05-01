import java.util.*;

class Solution {
    public static long solution(String s) {
        Map<String, Integer> digit = new HashMap<>();
        digit.put("zero", 0);
        digit.put("one", 1);
        digit.put("two", 2);
        digit.put("three", 3);
        digit.put("four", 4);
        digit.put("five", 5);
        digit.put("six", 6);
        digit.put("seven", 7);
        digit.put("eight", 8);
        digit.put("nine", 9);

        StringBuilder answer = new StringBuilder();
        StringBuilder wordBuffer = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                flushBuffer(wordBuffer, answer, digit);
                answer.append(c);
            } else {
                wordBuffer.append(c);
                flushBuffer(wordBuffer, answer, digit);
            }
        }
        flushBuffer(wordBuffer, answer, digit);

        return Long.parseLong(answer.toString());
    }

    private static void flushBuffer(StringBuilder buffer, StringBuilder result, Map<String, Integer> wordToDigit) {
        if (wordToDigit.containsKey(buffer.toString())) {
            result.append(wordToDigit.get(buffer.toString()));
            buffer.setLength(0);
        }
    }
}