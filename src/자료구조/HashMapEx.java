package 자료구조;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args){
        HashMap<String,String> map1 = new HashMap<String,String>();
        HashMap<String,String> map2 = new HashMap<>();
        HashMap<String,String> map3 = new HashMap<>(map1); // map1의 모든 값을 가짐
        HashMap<String,String> map4 = new HashMap<>(10); //초기 용량 10으로 설정
        HashMap<String,String> map5 = new HashMap<>(10,0.7f);
        HashMap<String,String> map6 = new HashMap<String,String>(){{
            put("a","b"); //초기값 지정
        }};
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"사과");
        map.put(2,"바나나"); //값 추가

        map.remove(1);

        //전체출력
        System.out.println(map);
        //특정원소출력
        System.out.println(map.get(1));

        //entrySet() 활용
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("[Key] : "+ entry.getKey() +"[Value] : " + entry.getValue());
        }

        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println("key-value : "+ entry + " /");;
            System.out.println("key : "+entry.getKey() + "/ value : "+ entry.getValue());
        }

        Iterator it2 = map.entrySet().iterator();
        while(it2.hasNext()){
            Map.Entry<Integer,Integer> entry = (Map.Entry)it.next();

        }

    }
}
