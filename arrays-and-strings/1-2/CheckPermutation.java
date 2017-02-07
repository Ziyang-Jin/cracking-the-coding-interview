import java.util.Arrays;

public class CheckPermutation {
    public static boolean check(String first, String second) {
        if (first.length() == second.length()) {
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
