public class 타겟넘버 {
    int answer = 0;
    public int solution(int[] numbers,int target){
        return answer;
    }

    public void dfs(int[] numbers,int depth,int target,int sum){
        if(depth==numbers.length){
            if(sum == target){
                answer++;
            }else{
                dfs(numbers,depth+1,target,sum+numbers[depth]);
                dfs(numbers,depth+1,target,sum-numbers[depth]);
            }
        }
    }

    public static void main(String[] args){

    }
}
