package Java.programmers.Level1;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        int count = 0;
        for (String string : seoul) {
            if (string.equals("Kim")) {
                break;
            } else count++;
        }

        return "김서방은 " + count + "에 있다";
    }
}
