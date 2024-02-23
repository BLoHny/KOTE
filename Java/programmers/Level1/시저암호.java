package Java.programmers.Level1;

public class 시저암호 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
    
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                sb.append((char) (base + (ch - base + n) % 26));
            } else {
                sb.append(ch);
            }
        }
    
        return sb.toString();
    }    
}
