package eight;

import definitions.IntNode;

public class FirstCommonAncestor {
    public static IntNode findFCA(IntNode a, IntNode b) {
    	IntNode temp = a.parent;
    	while (!isAncestor(temp, b) && temp != null) {
    		temp = temp.parent;
    	}
    	return temp;
    }
    
    public static boolean isAncestor(IntNode a, IntNode b) {
    	if (a == null) return false;
    	if (b != null && b.parent != a) {
    		if (a.left != null && isAncestor(a.left, b)) {
    			return true;
    		}
    		if (a.right != null && isAncestor(a.right, b)) {
    			return true;
    		}
    		return false;
    	} else {
    		return true;
    	}
    }
}
