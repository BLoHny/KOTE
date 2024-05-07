import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s, String skip, int index) {
        char[] sTo = s.toCharArray();
        List<Character> skTo = skip.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (char st : sTo) {
            int i = 0;
            while (i < index) {

                st = (char) ((st - 'a' + 1) % 26 + 'a');

                if (skTo.contains(st)) {
                    continue;
                }
                i++;
            }

            sb.append(st);
        }

        return sb.toString();
    }
}