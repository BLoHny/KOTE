package Java.programmers.Level1;

import java.util.HashMap;
import java.util.Map;

public class 가장많이받은선물 {
    public static void main(String[] args) {
        System.out.println( solution(new String[]{"joy", "brad", "alessandro", "conan", "david"} , new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"}) );
    }

    private static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] giftGraph = new int[friends.length][friends.length];
        int[][] result = new int[friends.length][4];
        HashMap<String , Integer > map = new HashMap<>();

        for( int i = 0 ; i < friends.length ; i++ ){
            map.put( friends[i] , i );
        }

        for( String temp : gifts ){
            String[] ab = temp.split(" ");
            String A = ab[0];
            String B = ab[1];
            giftGraph[map.get(A)][map.get(B)]++;
        }

        for( Map.Entry<String, Integer> a : map.entrySet()){
            int idx = a.getValue();
            int receivedCnt = 0;
            int givenCnt = 0;
            for( int i = 0 ; i < friends.length ; i++ ){
                givenCnt += giftGraph[idx][i];
            }
            result[idx][0] = givenCnt;

            for( int i = 0 ; i < friends.length ; i++ ){
                receivedCnt  += giftGraph[i][idx];
            }
            result[idx][1] = receivedCnt ;

            result[idx][2] = givenCnt - receivedCnt;

        }


        for( int i = 0 ; i < friends.length ; i ++ ){
            for ( int j = i+1 ; j < friends.length; j++ ){
                if( giftGraph[i][j] == giftGraph[j][i] ){
                    if( result[i][2] > result[j][2] ) result[i][3]++;
                    if( result[i][2] < result[j][2] ) result[j][3]++;
                    if( result[i][2] == result[j][2] ) continue;
                }
                else if ( giftGraph[i][j] > giftGraph[j][i] ) result[i][3]++;
                else if ( giftGraph[i][j] < giftGraph[j][i] ) result[j][3]++;
            }
        }

        for( int i = 0; i < friends.length ; i++ ){
            if( result[i][3] > answer ) answer = result[i][3];
        }

        return answer;
    }
}
