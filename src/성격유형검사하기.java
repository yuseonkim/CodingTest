import java.util.HashMap;

public class 성격유형검사하기 {
    static public StringBuilder solution(String[] survey, int[] choices) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int[] result = new int[4];
        for (int i = 0; i < survey.length; i++) {
            switch (survey[i]) {
                case "RT":
                    result[0] += (choices[i]-4);
                    break;
                case "TR":
                    result[0] -= (choices[i]-4);
                    break;
                case "CF":
                    result[1] += (choices[i]-4);
                    break;
                case "FC":
                    result[1] -= (choices[i]-4);
                    break;
                case "JM":
                    result[2] += (choices[i]-4);
                    break;
                case "MJ":
                    result[2] -= (choices[i]-4);
                    break;
                case "AN":
                    result[3] += (choices[i]-4);
                    break;
                case "NA":
                    result[3] -= (choices[i]-4);
                    break;
            }
        }
        StringBuilder answer = new StringBuilder();
        if (result[0] <= 0) {
            answer.append("R");
        } else {
            answer.append("T");
        }
        if (result[1] <= 0) {
            answer.append("C");
        } else {
            answer.append("F");
        }
        if (result[2] <= 0) {
            answer.append("J");
        } else {
            answer.append("M");
        }
        if (result[3] <= 0) {
            answer.append("A");
        } else {
            answer.append("N");
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }
}
