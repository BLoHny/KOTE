public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        
        int[][] board = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        }; 

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] bowl = new int[moves.length];
        int we_want = 0;
        

        for (int i = 0; i < moves.length; i++) {
            int ru = moves[i];

            for (int j = 0; j < board[0].length; j++) {
                if(board[j][ru - 1] != 0) {
                    int doll = board[j][ru - 1];
                    board[j][ru - 1] = 0;

                    if (we_want > 0 && bowl[we_want - 1] == doll) {
                        bowl[we_want - 1] = 0;
                        answer += 2;
                        we_want -= 1;
                    } else {
                        bowl[we_want] = doll;
                        we_want += 1;
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
