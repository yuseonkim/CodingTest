import java.util.Collection;
import java.util.HashMap;

public class 위장 {


    static int Solution(String[][] clothes){
        HashMap<String,Integer> map = new HashMap<>();

        for(int i =0;i< clothes.length;i++){
            String key = clothes[i][1];
            map.put(key,map.getOrDefault(key,1)+1);
        }

        if(map.size()>1){
            int count = 1;
            for(String k : map.keySet()){
                count *= map.get(k)+1;
            }
            return count -1;
        }
        else return clothes.length;
    }
    public static void main(String[] args){

    }
}
