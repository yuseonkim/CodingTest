import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {

    static String solution(int[] numbers){
        String[] str = new String[numbers.length];
        for(int i=0;i<str.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(str[0].equals("0")) return "0";
        String answer ="";
        for(String s : str){
            answer+=s;
        }
        return answer;
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3};
        solution(numbers);
    }
}
