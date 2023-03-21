import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class H_index {

    static int solution(int[] a) {
        // 6 5 3 1 0
        int answer = 0;
        Integer[] arr = new Integer[a.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a[i];
        }
        Arrays.sort(arr, (l1, l2) -> l2 - l1);
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        int h = 0;
        while (true) {
            for (int i = 0; i < a.length; i++) {

            }
        }
        //5 5 5 3 3 2 1
        //return answer;

    }

    public static void main(String[] args) {
        int[] a = {9000, 7000, 10000, 5000, 6000, 3000, 2000, 8000, 4000};
        System.out.println(solution(a));

    }
}
