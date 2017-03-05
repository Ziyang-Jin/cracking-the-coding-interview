package definitions;

import java.util.ArrayList;

public class Node {
    public String name;
    public ArrayList<Node> children;
    
    public Node(String name) {
    	this.name = name;
    	this.children = new ArrayList<Node>();
    }
    
    public void addChild(Node node) {
    	children.add(node);
    }
    
    public boolean equals(Node n) {
    	if (name != n.name || children.size() != n.children.size()) {
    		return false;
    	} else {
    		for (int i = 0; i < children.size(); i++) {
    			int index = find(children.get(i), n.children);
    			if (index == -1 || !children.get(i).equals(n.children.get(index))) {
    				return false;
    			} 
    		}
    		return true;
    	}
    }
    
    public static int find(Node node, ArrayList<Node> nodeArray) {
    	int i;
    	for (i = 0; i < nodeArray.size(); i++) {
    		if (node.name == nodeArray.get(i).name) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public static void printNode(Node node, int level) {
    	System.out.print("\n");
    	String prefix = "";
    	for (int i = 0; i < level*4; i++) {
    		prefix = prefix + " ";
    	}
    	System.out.println(prefix + "{name : " + node.name + ",");
    	System.out.print(prefix + " children : [");
    	if (!node.children.isEmpty()) {
    		for (int i = 0; i < node.children.size(); i++) {
    			printNode(node.children.get(i), level+1);
    			if (i < node.children.size()-1) {
    				System.out.print(",");
    			} else {
    				System.out.print("\n");
    			}
    		}
    		System.out.print(prefix + " ");
    	}
    	System.out.print("]}");
    }
}
