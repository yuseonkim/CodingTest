import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 명예의전당 {

    static int[] solution(int[] scores,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[scores.length];
        int i = 0;
        for(int score : scores){
            pq.add(score);
            if(pq.size()>k){
                pq.poll();
            }
            answer[i] = pq.peek();
        }

        return answer;
    }
    public static void main(String[] args){

    }
}
