import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class 숫자짝꿍 {

    static String solution(String X,String Y){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<X.length();i++){
            if(Y.contains(String.valueOf(X.charAt(i)))){
                set.add(X.charAt(i));
            }
        }
        ArrayList<Character> arr = new ArrayList<>(set);
        arr.sort((o1,o2)->(o2-o1));

        String answer = "";
        for(char a : arr){
            answer += String.valueOf(a);
        }

        if(answer.equals("")){
            return "-1";
        }
        return answer;
    }
    public static void main(String[] args){
        String x = "12321";
        String y = "42531";
        System.out.println(solution(x,y));
    }
}
