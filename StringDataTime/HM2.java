package ru.sber.StringDataTime;

import java.util.LinkedHashMap;
import java.util.Map;

public class HM2 {
    public static char get(String s) throws Exception {
        if (s.length() == 0) {
            System.out.println("0");
            System.exit(0);
        } else {
            Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

            for (int i = 0; i < s.length(); i++) {
                if (m.containsKey(s.charAt(i))) {
                    m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
                } else {
                    m.put(s.charAt(i), 1);
                }
            }
            int number;
            number = 0;
            for (Map.Entry<Character, Integer> hm : m.entrySet()) {
                if (hm.getValue() == 1) {
                    number++;
                    return hm.getKey();
                }
            }
            if (number == 0){
                System.out.println("0");
            }
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {

        System.out.print(get("My perdak is under attack"));

    }
}
