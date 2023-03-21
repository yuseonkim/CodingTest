public class 덧칠하기 {

    static int solution(int n,int m, int[] section){
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = 1;
        }
        for(int i=0;i<section.length;i++){
            arr[section[i]] = 0;
        }

        for(int i=1;i<=n;i++){
            //0011111 5
            if(arr[i] == 0) {
                answer++;
                for(int k = i ; k<=i+m-1  && k<=n;k++)
                    arr[k] = 1;
            }
        }
        //1011
        return answer;
    }
    public static void main(String[] args){
        int n = 6;
        int m = 5;
        int[] section = {5,6};
        System.out.println(solution(n,m,section));
    }
}
