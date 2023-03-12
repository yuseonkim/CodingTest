public class 옹알이 {

    static int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String a : babbling) {
            if (a.contains("ayaaya") || a.contains("yeye") || a.contains("woowoo") || a.contains("mama")) {
                break;
            }
            int count = 0;
            a = a.replaceAll("aya", " ");
            a = a.replaceAll("ye", " ");
            a = a.replaceAll("woo", " ");
            a = a.replaceAll("ma", " ");
            a = a.replaceAll(" ","");
            System.out.println(a);
            if (a.equals("")) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] s = {"maayama", "yee", "u", "maa"};
        System.out.println(solution(s));
    }
}
