import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class 개인정보수집유효기간 {
    public static void main(String[] args) {
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        for (int i : solution("2022.05.19", terms, privacies)) {
            System.out.println(i);
        }
    }

    public static List<Integer> solution(String today, String[] terms, String[] privacies) {
        String[] day = today.split("\\.");
        int totalD = (hi(day[0]) * 28 * 12) + (hi(day[1]) * 28) + hi(day[2]);

        List<Integer> answerArr = new ArrayList<>();
        HashMap<Character, Integer> termsMap = new HashMap<>();

        for(String term : terms){
            char termO = term.charAt(0);
            int termM = Integer.parseInt(term.substring(2));
            termsMap.put(termO,termM);
        }

        for(int i = 0; i < privacies.length; i++){
            char privacyO = privacies[i].charAt(11);
            int privacyY = Integer.parseInt(privacies[i].substring(0,4));
            int privacyM = Integer.parseInt(privacies[i].substring(5,7));
            int privacyD = Integer.parseInt(privacies[i].substring(8,10));
            int totalPrivacyD = (privacyY*12*28) + (privacyM*28) + privacyD;
            int termM = termsMap.get(privacyO);
            int termDay = termM * 28;
            if(totalPrivacyD+termDay <=totalD){
                answerArr.add(i+1);
            }
        }

        return answerArr;
    }

    public static int hi(String day) {
        return Integer.parseInt(day);
    }
}
