package 자료구조;

public class 체육복 {
    static int solution(int n,int[] lost, int[] reserve){
        int[] student = new int[n+1];
        int[] newStu = new int[n+1];
        for(int i=1;i<=n;i++){
            student[i] = 1;
        }
        for(int a : lost){
            student[a]--;
        }
        for(int a : reserve){
            student[a]++;
        }
        for(int i=1;i<=n;i++){
            newStu[i] = student[i];
        }

        for(int i=2;i<n;i++){
            if(student[i-1] == 2 && student[i] == 0){
                student[i-1] = 1;
                student[i] = 1;
            }
            if(student[i+1] == 2 && student[i] == 0){
                student[i+1] = 1;
                student[i] = 1;
            }
            if(student[i-1] == 0 && student[i] == 2){
                student[i-1] = 1;
                student[i] = 1;
            }
            if(student[i+1] == 0 && student[i] == 2){
                student[i+1] = 1;
                student[i] = 1;
            }
        }
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(student[i] != 0 ){
                answer++;
            }
        }
        return answer;
    }
    // 1 1 1 1 2
    public static void main(String[] args){
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        System.out.println(solution(n,lost,reserve));
    }
}
