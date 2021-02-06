package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {

        String[] words = {"A", "B", "C", "D", "E", "B", "A", "F", "A", "E", "A", "C", "A", "D"};

        Map<String, Integer> map = new HashMap<>();

        for (String word :
                words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        //System.out.println(map);

        for (Map.Entry<String, Integer> pair :
        map.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
