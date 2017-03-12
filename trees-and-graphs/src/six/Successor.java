package six;

import definitions.IntNode;

public class Successor {
    public static IntNode findSuccessor(IntNode node) {
    	if (node != null) {
    		if (node.right != null) {
    			return nextInOrder(node.right);
    		}

    		if (node.parent != null) {
    			return childRoutine(node);
    		}
    	}
    	return null;
    }
    
    public static IntNode nextInOrder(IntNode node) {
    	if (node.left != null) {
    		return nextInOrder(node.left);
    	}
    	return node;
    }
    
    public static IntNode childRoutine(IntNode node) {
		if (node.parent.left == node) {
			return node.parent;
		} else {
			if (node.parent.parent != null) {
			    return childRoutine(node.parent);
			} else {
				return null;
			}
		}
    }
}
