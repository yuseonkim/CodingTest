package 자료구조;

import java.util.Scanner;

public class DFS알고리즘 {
    static final int MAX_N = 10;
    static int[][] Graph = new int[MAX_N][MAX_N];
    static int N, E;
    static boolean[] visited = new boolean[MAX_N];


    static void dfs(int node){
        visited[node] = true;
        System.out.println(node + " ");
        for(int next = 0;next<N;next++){
            if(!visited[next] && Graph[node][next] != 0)
                dfs(next);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        E = sc.nextInt();

        for(int i=0;i<E;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            Graph[u][v] = Graph[v][u] = 1;
        }
        dfs(0);
    }
}
