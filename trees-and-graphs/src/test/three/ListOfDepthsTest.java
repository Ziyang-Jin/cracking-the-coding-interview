package test.three;

import org.junit.Test;

import definitions.IntNode;
import three.ListOfDepths;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;

public class ListOfDepthsTest {
	IntNode root;
	
	@Before
	public void setUp() {
		root = new IntNode(1);
		root.left = new IntNode(2);
		root.right = new IntNode(3);
		root.left.left = new IntNode(4);
		root.left.right = new IntNode(5);
		root.right.left = new IntNode(6);
		root.right.right = new IntNode(7);
	}
	
    @Test
    public void test() {
    	List<LinkedList<IntNode>> result = ListOfDepths.listOfDepths(root);
    	for (int i = 0; i < result.size(); i++) {
    		System.out.print("List at depth " + i + ":");
    		printLinkedList(result.get(i));
    	}
    }
    
    public static void printLinkedList(LinkedList<IntNode> l) {
    	for (int i = 0; i < l.size(); i++) {
    	    System.out.print("->" + l.get(i).val);
    	}
    	System.out.println();
    }
}
