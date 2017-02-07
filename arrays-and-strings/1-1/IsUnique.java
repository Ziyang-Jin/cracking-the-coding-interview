public class IsUnique {

    public static  boolean checkUniqueness(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (include(s.substring(i+1), s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean include(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }

}
