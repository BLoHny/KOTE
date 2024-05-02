import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++) {
            if ( 
                babbling[i].contains("ayaaya") || 
                babbling[i].contains("yeye") || 
                babbling[i].contains("woowoo") ||
                babbling[i].contains("mama")
            ) continue;
            
            
            babbling[i] = babbling[i].replaceAll("aya", "0");
            babbling[i] = babbling[i].replaceAll("woo", "0");
            babbling[i] = babbling[i].replaceAll("ye", "0");
            babbling[i] = babbling[i].replaceAll("ma", "0");
            babbling[i] = babbling[i].replaceAll("0", "");
            
            if(babbling[i].equals("")) answer++;
        }
        
        return answer;
    }
}