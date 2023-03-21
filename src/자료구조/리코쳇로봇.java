package 자료구조;

import java.util.ArrayList;
import java.util.Arrays;

public class 리코쳇로봇 {

    static char[][] arr;

    static ArrayList<Integer> arrayList = new ArrayList<>();

    static int solution(String[] board) {
        int C = 0;
        int R = 0;
       arr = new char[board.length][];
        for (int i = 0; i < board.length; i++) {
            arr[i] = board[i].toCharArray();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 'R') {
                    C = i;
                    R = j;
                }
            }
        }
        System.out.println(arr.length+" " + C + " " + R);
        dfs(C, R, 0);

        for (int a : arrayList) {
            System.out.println(a);
        }
        return 0;
    }

    static void dfs(int C, int R, int count) {
        if (R < 0 || R > arr[0].length - 1
                || C < 0 || C > arr.length - 1) return;

        if (arr[C][R] == 'G') {
            arrayList.add(count);
            return;
        }

        if (arr[C][R] == 'D' || arr[C][R] == 'c') return;
        arr[C][R] = 'c';

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
            System.out.println("");
            }
        System.out.println("-------");
        dfs(C + 1, R, count + 1);
        dfs(C - 1, R, count + 1);
        dfs(C, R + 1, count + 1);
        dfs(C, R - 1, count + 1);
    }

    public static void main(String[] args) {
        String[] board = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
        System.out.println(solution(board));

    }
}
