package definitions;

public class Node {
    public String name;
    public Node[] children;
    
    public Node(String name) {
    	this.name = name;
    	this.children = new Node[0];
    }
    
    public void addChild(Node node) {
    	Node[] newArray = new Node[children.length+1];
    	for (int i = 0; i < children.length; i++) {
    		newArray[i] = children[i];
    	}
    	newArray[newArray.length-1] = node;
    	children = newArray;
    }
    
    public boolean equals(Node n) {
    	if (name != n.name) {
    		return false;
    	} else if (children.length == n.children.length) {
    		for (int i = 0; i < children.length; i++) {
    			int index = find(children[i], n.children);
    			if (index == -1 || !children[i].equals(n.children[index])) {
    				return false;
    			} 
    		}
    		return true;
    	} else {
    		return false;
    	}
    }
    
    // find a node in a nodeArray, return the index
    // return -1 of node cannot be found in nodeArray
    public static int find(Node node, Node[] nodeArray) {
    	int i;
    	for (i = 0; i < nodeArray.length; i++) {
    		if (node.name == nodeArray[i].name) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public static void printNode(Node node, int level) {
    	String prefix = "";
    	for (int i = 0; i < level*4; i++) {
    		prefix = prefix + " ";
    	}
    	System.out.println(prefix + "{name : " + node.name + ",");
    	System.out.print(prefix + " children : ");
    	System.out.print("[");
    	if (node.children.length > 0) {
    		System.out.println("");
    		for (int i = 0; i < node.children.length; i++) {
    			printNode(node.children[i], level+1);
    		}
    		System.out.print("]}\n");
    	} else {
    		System.out.print("]},\n");
    	}
    }
}
