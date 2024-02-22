package Java.programmers.Level1;

import java.util.stream.Stream;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        return Stream.of("".concat(s))
                    .mapToInt(String::length)
                    .anyMatch(len -> len == 4 || len == 6)
                && s.chars().allMatch(Character::isDigit);
    }
}
