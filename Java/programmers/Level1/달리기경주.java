import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    public static void main(String[] args) {
        String[] f = {"mumu", "soe", "poe", "kai", "mine"};
        String[] c = {"kai", "kai", "mine", "mine"};
    }
}

class Solution {
    public static String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(String player : callings) {
            
            int o_rank = map.get(player);

            String b_rank = players[o_rank - 1];

            players[o_rank - 1] = player;
            players[o_rank] = b_rank;

            map.put(player, o_rank - 1);
            map.put(b_rank, o_rank);
        }

        return players;
    }
}