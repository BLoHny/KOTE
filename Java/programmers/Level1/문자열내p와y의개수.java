package Java.programmers.Level1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        return s.toLowerCase()
                .chars()
                .filter(c -> c == 'p').count() == s.toLowerCase().chars().filter(c -> c == 'y').count();
    }
}