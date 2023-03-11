public class 프렌즈4블록 {

    static int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] chars = new char[m][n];
        int[][] arr = new int[m - 1][n - 1];


        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                chars[i][j] = board[i].charAt(j);
            }
        }

        while (true) {
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (chars[i][j] == chars[i + 1][j] && chars[i][j + 1] == chars[i][j] && chars[i][j + 1] == chars[i + 1][j + 1]) {
                        answer++;
                        arr[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (arr[i][j] == 1) {
                        chars[i][j] = chars[i][j+2];
                        chars[i + 1][j] = chars[i+1][j+2];
                        chars[i + 1][j + 1] = chars[i+1][j+3] ;
                        chars[i][j + 1] = chars[i][j+3];
                    }
                }
            }


        }


    }


    public static void main(String[] args) {

    }
}
