class Solution {
    public static int solution(int n) {
        String sam = toSam(n);
        StringBuffer sb = new StringBuffer(sam);
        String reverse = sb.reverse().toString();
        return toTen(reverse);
    }

    public static String toSam(int base3) {
        return Integer.toString(base3, 3);
    }

    public static Integer toTen(String decimal) {
        return Integer.parseInt(decimal, 3);
    }
}