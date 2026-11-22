package agh.po.lab4;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();
        m1.put("a", "Hi");
        m1.put("b", "There");
        System.out.println(mapAB(m1));

        Map<String, String> m2 = new HashMap<>();
        m2.put("a", "Hi");
        System.out.println(mapAB(m2));

        Map<String, String> m3 = new HashMap<>();
        m3.put("b", "There");
        System.out.println(mapAB(m3));

        System.out.println(wordLen(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(wordLen(new String[]{"this", "and", "that", "and"}));
        System.out.println(wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}