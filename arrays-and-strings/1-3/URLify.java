public class URLify {
    public static String urlify(char[] a, int l) {
        String s = "";
        for (int i = 0; i < l; i++) {
            if (a[i] != ' ') {
                s = s + a[i];
            } else {
                s = s + "%20";
            }
        } 
        return s;
    }
}
