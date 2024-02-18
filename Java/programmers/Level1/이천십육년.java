package Java.programmers.Level1;

import java.time.LocalDate;

public class 이천십육년 {
    public String solution(int a, int b) {
        LocalDate time = LocalDate.of(2016, a, b);
        return String.valueOf(time.getDayOfWeek()).substring(0, 3);
    }
}
