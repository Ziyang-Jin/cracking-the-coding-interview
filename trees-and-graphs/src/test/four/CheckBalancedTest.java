package test.four;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import definitions.IntNode;
import four.CheckBalanced;

public class CheckBalancedTest {
    IntNode root;
    
    @Before
    public void setUp() {
    	root = new IntNode(1);
    	root.left = new IntNode(2);
    	root.right = new IntNode(3);
    }
    
    //       1
    //     2   3
    //   4       6
    // 5       7   8
	
	@Test
	public void test() {
		assertTrue(CheckBalanced.isBalanced(root));
		root.left.left = new IntNode(4);
		root.left.left.left = new IntNode(5);
		root.right.right = new IntNode(6);
		root.right.right.left = new IntNode(7);
		root.right.right.right = new IntNode(8);
		assertFalse(CheckBalanced.isBalanced(root));
		assertFalse(CheckBalanced.isBalanced(root.left));
		assertTrue(CheckBalanced.isBalanced(root.left.left));
		assertFalse(CheckBalanced.isBalanced(root.right));
		assertTrue(CheckBalanced.isBalanced(root.right.right));
	}

}
