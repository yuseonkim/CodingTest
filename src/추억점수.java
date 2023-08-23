import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo =
                {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }


        ArrayList<Integer> arr = new ArrayList<>();
        for (String[] strings : photo) {
            int result = 0;
            for (String key : strings) {
                if(!map.containsKey(key)){
                    continue;
                }
                result += map.get(key);
            }
            arr.add(result);
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
