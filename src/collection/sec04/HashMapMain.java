package collection.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // 키가 같이 때문에 제일 마지막에 저장한 값만 저장
        System.out.println("총 엔트리 수 : " + map.size());
        System.out.println();

        String key = "홍길동";
        Integer value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            int v = map.get(key);
            System.out.println(k + ": " + v);
        }
        System.out.println();

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 엔트리 수 : " + map.size());
        System.out.println();
    }
}
