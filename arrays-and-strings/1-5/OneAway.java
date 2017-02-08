public class OneAway {
    
    public static boolean check(String goal, String curr) {
        switch (goal.length() - curr.length()) {
            case 1:
                return isInsert(goal, curr);
            case 0:
                return isReplace(goal, curr);
            case -1:
                return isRemove(goal, curr);
            default: 
                return false;
        }
        
    }
    
    private static int diffIndex(String goal, String curr) {
        int i;
        for (i = 0; i < curr.length(); i++) {
            if (goal.charAt(i) != curr.charAt(i)) {
                break;
            }
        }
        return i;
    }
    
    private static boolean isInsert(String goal, String curr) {
        int i = diffIndex(goal, curr);
        if (i < curr.length()) {
            curr = curr.substring(0, i) + goal.charAt(i) + curr.substring(i);
        } else {
            curr = curr + goal.charAt(i);
        }
        return curr.equals(goal);
    }
    
    private static boolean isReplace(String goal, String curr) {
        int i = diffIndex(goal, curr);
        if (i < curr.length()) {
            curr = curr.substring(0, i) + goal.charAt(i) + curr.substring(i+1);
            return curr.equals(goal);
        } else {
            return true;
        }
    }
    
    private static boolean isRemove(String goal, String curr) {
        return isInsert(curr, goal);
    }
    
}

