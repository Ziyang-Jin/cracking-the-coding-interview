package three;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import definitions.IntNode;

public class ListOfDepths {
    public static List<LinkedList<IntNode>> listOfDepths(IntNode root) {
    	List<LinkedList<IntNode>> result = new ArrayList<LinkedList<IntNode>>();
    	int depth = 0;
    	addNodeToList(result, root, depth);
    	return result;
    }
    
    public static void addNodeToList(List<LinkedList<IntNode>> result, IntNode root, int depth) {
    	if (root != null) {
    		if (result.size() <= depth) {
    			for (int i = result.size(); i <= depth; i++) {
    				result.add(new LinkedList<IntNode> ());
    			}
    		}
    		LinkedList<IntNode> list = result.get(depth);
    		list.add(root);
    		addNodeToList(result, root.left, depth+1);
    		addNodeToList(result, root.right, depth+1);
    	}
    }
}
