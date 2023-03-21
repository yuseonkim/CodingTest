package PCCP모의고사;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class 외톨이알파벳 {

    static String solution(String input_string) {
        HashSet<Character> set = new HashSet<>();
        ArrayList<Character> check = new ArrayList<>();
        ArrayList<Character> arr = new ArrayList<>();
        char save = '*';
        for(int i=0;i<input_string.length();i++){
            char k = input_string.charAt(i);
            if(save == k)
                continue;
            save = k;
            for(char a : check){
                if(a == k){;
                    set.add(k);
                    break;
                }
            }
            check.add(k);
        }
        arr.addAll(set);

        arr.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1 - o2;
            }
        });
        String s = "";
        for(char a : arr){
            s+=String.valueOf(a);
        }
        if(s == ""){
            return "N";
        }
        return s;
    }

    public static void main(String[] args) {
        String a = "zbzbz";
        System.out.println(solution(a));
    }
}
