import java.util.ArrayList;
import java.util.HashMap;

public class 가장가까운같은글자 {

    static ArrayList<Integer> solution(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                arr.add(i - map.get(c));
            }else{
                arr.add(-1);
            }
            map.put(c,i);
        }

        return arr;

    }
    public static void main(String[] args){

    }
}
