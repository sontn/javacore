package StudyAndShare;

import java.util.HashMap;
import java.util.Map;

public class Unit49 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("S", 12345);
        map.put("L", 123);
        map.put("H", 7234);
        System.out.println(map);
        System.out.println(map.get("Son"));
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
