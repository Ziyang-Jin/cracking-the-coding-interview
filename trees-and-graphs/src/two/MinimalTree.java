package two;

import definitions.IntNode;

// Given a sorted (increasing order) array with unique integer elements, write
// an algorithm to create a binary search tree with minimal height
public class MinimalTree {
    public static final IntNode generateMinialTree(int[] array) {
    	int m = array.length / 2;
    	IntNode root = new IntNode(array[m]);
    	root.left = generateNode(array, 0, m);
    	root.right = generateNode(array, m+1, array.length);
    	return root;
    }
    
    public static final IntNode generateNode(int[] array, int begin, int end) {
    	if (begin != end) {
    	    int middle = (begin + end) / 2;
    	    IntNode node = new IntNode(array[middle]);
    	    node.left = generateNode(array, begin, middle);
    	    node.right = generateNode(array, middle+1, end);
    	    return node;
    	} else {
    		return null;
    	}
    }
}
