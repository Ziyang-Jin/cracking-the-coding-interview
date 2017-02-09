public class StrCompression {
    public static String compress(String s) {
        if (s.length() > 2) {
            String result = compressStr(s.toCharArray());
            return result.length() < s.length() ? result : s;
        } else {
            return s;
        }
    }

    private static String compressStr(char[] a) {
        String result = "";
        char curr = a[0];
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (curr == a[i]) {
                count++;
            } else {
                result = result + curr + count;
                count = 1;
                curr = a[i];
            }
        }
        return result + a[a.length-1] + count;
    }
}
