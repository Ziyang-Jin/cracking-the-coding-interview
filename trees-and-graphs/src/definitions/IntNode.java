package definitions;

public class IntNode {
    public int val;
    public IntNode left;
    public IntNode right;
    
    public IntNode(int val) {
    	this.val = val;
    	this.left = null;
    	this.right = null;
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
