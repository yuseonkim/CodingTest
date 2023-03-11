import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {

    static int solution(int[] properties, int location) {
        int answer = 0;
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int a : properties) {
            queue.add(a);
        }

        while(true){
            int checkPrintable = 0;
            int property = queue.remove();
            location--;
            for (int element : queue) {
                if (element > property) {
                    if (location == 0) {
                        location = queue.size();
                    }
                    queue.add(property);
                    checkPrintable = 1;
                    break;
                }
            }
            if(checkPrintable == 0){
                count++;
            }
            if(location == 0){
                answer = count;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2},2));
    }
}
