package Java.programmers.Level1;

import java.util.Arrays;

public class 문자열내림차순배치 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
