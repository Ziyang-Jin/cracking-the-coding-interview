public class StrRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length()) {
            s1 = s1 + s1;
            return isSubstring(s2, s1);
        } else {
            return false;
        }   
    }

    // check if s1 is a substring of s2
    private static boolean isSubstring(String s1, String s2) {
        return s2.contains(s1);
    }
}
