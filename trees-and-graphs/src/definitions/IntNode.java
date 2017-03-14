package definitions;

public class IntNode {
    public int val;
    public IntNode left;
    public IntNode right;
    public IntNode parent;
    
    public IntNode(int val) {
    	this.val = val;
    	this.left = null;
    	this.right = null;
    	this.parent = null;
    }
    
    public static IntNode createSimpleBinaryTree() {
    	IntNode root = new IntNode(1);
    	root.left = new IntNode(2);
    	root.left.parent = root;
    	root.right = new IntNode(3);
    	root.right.parent = root;
    	root.left.left = new IntNode(4);
    	root.left.left.parent = root.left;
    	root.left.right = new IntNode(5);
    	root.left.right.parent = root.left;
    	root.right.left = new IntNode(6);
    	root.right.left.parent = root.right;
    	root.right.right = new IntNode(7);
    	root.right.right.parent = root.right;
    	return root;
    }
    
    public static void printNode(IntNode node, int level) {
        String prefix = "";
        for (int i = 0; i < level*8; i++) {
            prefix = prefix + " ";
        }
        System.out.print("{ val : " + node.val);
        System.out.print(",\n");
    	System.out.print(prefix + "  left : ");
        if (node.left != null) {
        	printNode(node.left, level+1);
        } else {
        	System.out.print("null");
        }
        System.out.print(",\n");
    	System.out.print(prefix + "  right : ");
        if (node.right != null) {
        	printNode(node.right, level+1);
        } else {
        	System.out.print("null");
        }
        System.out.print(" }");
    }
}
