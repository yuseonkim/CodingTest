public class 혼자하는틱택토 {

    boolean tictactoWon(String[] board,char a){
        if(board[0].charAt(0) == a &&board[0].charAt(1) == a && board[0].charAt(2) == a)
            return true;
        if(board[1].charAt(0) == a &&board[1].charAt(1) == a && board[1].charAt(2) == a)
            return true;
        if(board[2].charAt(0) == a &&board[2].charAt(1) == a && board[2].charAt(2) == a)
            return true;
        if(board[0].charAt(0) == a &&board[1].charAt(0) == a && board[2].charAt(0) == a)
            return true;
        if(board[0].charAt(1) == a &&board[1].charAt(1) == a && board[2].charAt(1) == a)
            return true;
        if(board[0].charAt(2) == a &&board[1].charAt(2) == a && board[2].charAt(2) == a)
            return true;
        if(board[0].charAt(0) == a &&board[1].charAt(1) == a && board[2].charAt(2) == a)
            return true;
        if(board[2].charAt(0) == a &&board[1].charAt(1) == a && board[0].charAt(2) == a)
            return true;
        return false;
    }
    public int solution(String[] board) {
        int answer = -1;
        int xCount = 0;
        int oCount = 0;

        for (String a : board) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'O') {
                    oCount++;
                }
                if (a.charAt(i) == 'X'){
                    xCount++;
                }
            }
        }
        if(tictactoWon(board,'O') && tictactoWon(board,'X'))
            return 0;

        if(tictactoWon(board,'X')&& (oCount > xCount) )
            return 0;

        if(tictactoWon(board,'O') && (xCount == oCount))
            return 0;

        if(oCount > xCount + 1){
            return 0;
        }
        if(xCount > oCount){
            return 0;
        }

        return 1;
        //잘못된 게임일 경우
        //1.X만 덩그러니
        //2.O보다 X 개수가 더 많음
        //3.승자가 두명
        //4.O의 개수가 X보다 두개 이상 더 많음

    }

    public static void main(String[] args) {

    }
}
