import java.util.ArrayList;
import java.util.Stack;

public class 기능개발 {
    public static ArrayList<Integer> Solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=speeds.length-1;i>=0;i--){
            stack.push(i);
        }
        int[][] arr = new int[speeds.length][2];
        for(int[] ar : arr){
            ar[1] = 1;
        }
        for (int i = 0; i < speeds.length; i++) {
            double value = (double) (100 - progresses[i]) / speeds[i];
            if (Math.ceil(value) == value) {
                arr[i][0] = (int) value;
            } else {
                arr[i][0] = (int) Math.ceil(value);
            }
        }
        int count = 0;
        while (!stack.empty()) {
            for (int i = 0; i < speeds.length; i++) {
                arr[i][0] = arr[i][0] -1;
                if(arr[i][0] == 0)
                    arr[i][1] = 0;
            }
            while(count <= speeds.length-1){
                int max = 0;
                if(arr[count][1] == 0)
                {
                    stack.pop();
                    count++;
                    max++;
                }
                else{
                    break;
                }
                answer.add(max);

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {93, 30, 55};
        int[] b = {1, 30, 5};
        ArrayList<Integer> k = Solution(a,b);
        for(int c : k){
            System.out.println(k);
        }
     }
}
