package four;

import definitions.IntNode;

public class CheckBalanced {
    public static boolean isBalanced(IntNode root) {
    	if (root == null) return true;
    	else {
    		int leftHeight = getHeight(root.left);
    		int rightHeight = getHeight(root.right);
    		int diff = leftHeight - rightHeight;
    		if (diff >= -1 && diff <= 1) {
    			return isBalanced(root.left) && isBalanced(root.right);
    		} else {
    			return false;
    		}
    	}
    }
    
    public static int getHeight(IntNode node) {
    	if (node == null) {
    		return -1;
    	} else {
    		int leftHeight = getHeight(node.left);
    		int rightHeight = getHeight(node.right);
    		int height = leftHeight > rightHeight ? leftHeight : rightHeight;
    		return 1 + height;
    	}
    }
}
