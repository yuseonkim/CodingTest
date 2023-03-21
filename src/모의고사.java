import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 모의고사 {
    static ArrayList<Integer> solution(int[] answers){
        int[][] sol = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        ArrayList<Integer> answer = new ArrayList<>();
        int[] scores = new int[3];
        int[] copy = new int[3];
        for(int i=0;i<answers.length;i++){
            for(int j=0;j<sol.length;j++){
                int k = answers.length;
                if(answers[i] == sol[j][i%k]) {
                    scores[j]++;
                    copy[j]++;
                }
            }
        }

         Arrays.sort(scores);
        int max = scores[2];
        for(int i=0;i<scores.length;i++){
            if(max == copy[i]){
                answer.add(i+1);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        int[] answers = {1,2,3,4,5};
        System.out.println(solution(answers));
    }
}
