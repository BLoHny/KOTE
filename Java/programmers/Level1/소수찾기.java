package Java.programmers.Level1;

import java.util.stream.IntStream;

public class 소수찾기 {
    public long solution(int n) {
        return IntStream.range(2, n + 1)
                        .filter(소수찾기::isPrime)
                        .count();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
