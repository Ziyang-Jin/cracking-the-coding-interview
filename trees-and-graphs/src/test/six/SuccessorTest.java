package test.six;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import definitions.IntNode;
import six.Successor;

public class SuccessorTest {
	IntNode root;
	
	@Before
	public void setUp() {
		root = new IntNode(1);
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
	}

	@Test
	public void test() {
		assertEquals(root.left, Successor.findSuccessor(root.left.left));
		assertEquals(root.left.right, Successor.findSuccessor(root.left));
		assertEquals(root, Successor.findSuccessor(root.left.right));
		assertEquals(root.right.left, Successor.findSuccessor(root));
		assertEquals(root.right, Successor.findSuccessor(root.right.left));
		assertEquals(root.right.right, Successor.findSuccessor(root.right));
		assertEquals(null, Successor.findSuccessor(root.right.right));
	}

}
