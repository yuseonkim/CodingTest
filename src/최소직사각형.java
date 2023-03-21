import java.util.Arrays;
import java.util.Comparator;

public class 최소직사각형 {

    static int solution(int[][] sizes){
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp;
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        Arrays.sort(sizes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        int a = sizes[0][0];
        Arrays.sort(sizes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int b = sizes[0][1];
        System.out.println(a);
        System.out.println(b);

        return a*b;


    }
    public static void main(String[] args){
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }
}
