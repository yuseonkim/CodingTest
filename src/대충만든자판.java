
public class 대충만든자판 {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int k =0;
        for(String target: targets){
            int check = 0;
            int sum = 0;
            for(int i=0;i<target.length();i++){

                String charactor = String.valueOf(target.charAt(i));
                int num = 101;
                for(String key : keymap){
                    if(key.indexOf(charactor)!= -1) {
                        int ex = key.indexOf(charactor) + 1;
                        if (ex < num)
                            num = ex;

                        System.out.println(num);
                    }
                }
                if(num == 101){
                    answer[k++] = -1;
                    check = 1;
                    break;
                }
                sum += num;
            }
            if(check == 0)
            answer[k++] = sum;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] keymap = {"A"};
        String[] targets = {"BB","CC"};
        int[] answer = solution(keymap, targets);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }


    }
}
