import java.util.HashMap;

public class Palindrome {
    public static boolean check(String s) {
        HashMap<Character, Integer> map = mapChar(s.toCharArray());
        return checkMap(map, s.length());
    }
    
    private static HashMap<Character, Integer> mapChar(char[] a) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int v = map.get(a[i]);
                map.put(a[i], v+1);
            } else {
                map.put(a[i], 1);
            }
        }
        return map;
    }
    
    private static boolean checkMap(HashMap<Character, Integer> map, int l) {
        int count = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                count++;
            }
        }
        if (count > 1 || count == 1 && l % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
