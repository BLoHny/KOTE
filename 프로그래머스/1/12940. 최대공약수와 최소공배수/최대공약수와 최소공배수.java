import java.math.BigInteger;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        BigInteger a = BigInteger.valueOf(n);
        BigInteger b = BigInteger.valueOf(m);

        answer[0] = a.gcd(b).intValue();  
        answer[1] = a.multiply(b).divide(a.gcd(b)).intValue();
        return answer;
    }
}