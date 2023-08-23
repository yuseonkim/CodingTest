import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 달리기경주 {
    static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;
        for (String player : players) {
         map.put(player,i++);
        }
        for(String call : callings){
            int rating = map.get(call);
            players[rating] = players[rating-1];
            players[rating-1] = call;
            map.replace(call,rating-1);
            map.replace(players[rating],rating);
        }

        return players;
    }


    public static void main(String[] args) {

    }
}
