

import java.util.*;

public class 캐시 {

    static int solution(int cacheSize, String[] cities) {
        Cache<String,Integer> cache = new Cache<>(cacheSize);
        int answer = 0;

        for(String city : cities){
            city = city.toUpperCase();
            if(cache.containsKey(city)) {
                answer += 1;
            }else {
                answer += 5;
            }
            cache.put(city,0);
            System.out.println(cache.keySet());

        }

        return answer;
    }

    static class Cache<String,Integer> extends LinkedHashMap<String,Integer>{
        int capacity = 1;

        public Cache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<String,Integer> eldest){
            return size()>capacity;
        }
    }
    public static void main(String[] arg){
            int n = 3;
            String[] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(3,arr));
    }
}
