import 자료구조.HashMapEx;

import java.util.*;

public class 폰켓몬 {

    public static int Solution(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,1)+1);
        }
        int size = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        int i = 1;
        while(arr.size() < map.size()) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(i)) {
                    if(count >=size/2)
                        return arr.size();
                    arr.add(entry.getKey());
                    count += 1;


                }
            }
            i++;
        }

        return arr.size();







    }
    public static void main(String[] args){
        int[] nums = {1,2,2,4,4,3};

        System.out.println(Solution(nums));
    }
}
