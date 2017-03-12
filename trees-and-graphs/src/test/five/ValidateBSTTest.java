package test.five;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import definitions.IntNode;
import five.ValidateBST;

public class ValidateBSTTest {
	IntNode root;
	
	@Before
	public void setUp() {
		root = new IntNode(2);
		root.left = new IntNode(1);
		root.right = new IntNode(3);
	}

	//    2
	//  1   3
	//    5   4
	@Test
	public void test() {
		assertTrue(ValidateBST.validateBST(root));
		root.right.right = new IntNode(4);
		assertTrue(ValidateBST.validateBST(root));
		root.right.left = new IntNode(5);
		assertFalse(ValidateBST.validateBST(root));	
	}

}
