package five;

import definitions.IntNode;

public class ValidateBST {
    public static boolean validateBST(IntNode root) {
    	boolean isBST = true;
    	if (root != null) {
    		if (root.left != null) {
    			isBST = root.left.val <= root.val ? validateBST(root.left) : false;
    		}
    		if (isBST && root.right != null && root.val <= root.right.val) {
    			isBST = root.val <= root.right.val ? validateBST(root.right) : false;
    		}
    	}
        return isBST;
    }
}
