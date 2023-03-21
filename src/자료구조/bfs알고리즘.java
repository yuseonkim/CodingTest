package 자료구조;

import java.util.LinkedList;
import java.util.Queue;

public class bfs알고리즘 {
    static class Point {
        int row;
        int col;
        int dist;

        Point(int r, int c, int d) {
            row = r;
            col = c;
            dist = d;
        }
    }

    static int solution(int[][] maps) {
        return bfs(0,0,maps.length-1,maps[0].length-1,maps);
    }

    static int bfs(int sRow, int sCol, int dRow, int dCol, int[][] map) {
        boolean[][] visited = new boolean[map.length][map[0].length];
        int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<Point> myQueue = new LinkedList<>();
        visited[sRow][sCol] = true;
        myQueue.add(new Point(sRow, sCol, 1));


        while (!myQueue.isEmpty()) {
            Point curr = myQueue.remove();
            if (curr.col == dCol && curr.row == dRow)
                return curr.dist;

            for (int i = 0; i < 4; i++) {
                int nr = curr.row + D[i][0];
                int nc = curr.col + D[i][1];
                if (nr < 0 || nr > map.length - 1 || nc < 0 || nc > map[0].length-1) continue;
                if(visited[nr][nc]) continue;
                if(map[nr][nc] == 0) continue;
                visited[nr][nc] = true;
                myQueue.add(new Point(nr,nc,curr.dist+1));
            }
            //123
            //123
            //123
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(map));
    }
}
