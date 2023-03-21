public class 시소짝꿍 {

    static boolean check(int a, int b) {
        if (a * 2 == 3 * b)
            return true;
        if (a * 2 == 4 * b)
            return true;
        if (a * 3 == 4 * b)
            return true;

        if (a * 4 == 2 * b)
            return true;

        if (a * 3 == 2 * b)
            return true;
        if (a * 4 == 3 * b)
            return true;
        if (a == b)
            return true;

        return false;
    }

    static long solution(int[] weights) {
        long answer = 0;
        int k = 0;
        for (int i = 0; i < weights.length; i++) {
            System.out.println(k);
            for (int j = k; j < weights.length; j++) {
                System.out.println(weights[i]+ " : "+ weights[j]);
                if (check(weights[i], weights[j]))
                    answer++;
            }
            k++;
        }
        return answer=weights.length;
    }


    public static void main(String[] args) {
        int[] weights ={100,180,360,100,270};
        System.out.println(solution(weights));


    }
}
