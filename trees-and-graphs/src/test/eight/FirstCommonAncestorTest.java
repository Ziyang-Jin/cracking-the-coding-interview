package test.eight;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import definitions.IntNode;
import eight.FirstCommonAncestor;

public class FirstCommonAncestorTest {
	IntNode root;
	
	@Before
	public void setUp() {
        root = IntNode.createSimpleBinaryTree();
	}

	@Test
	public void testIsAncestor() {
		assertTrue(FirstCommonAncestor.isAncestor(root, root.left));
		assertTrue(FirstCommonAncestor.isAncestor(root, root.right));
		assertTrue(FirstCommonAncestor.isAncestor(root, root.left.left));
		assertTrue(FirstCommonAncestor.isAncestor(root, root.left.right));
		assertTrue(FirstCommonAncestor.isAncestor(root, root.right.left));
		assertTrue(FirstCommonAncestor.isAncestor(root, root.right.right));
		
		assertTrue(FirstCommonAncestor.isAncestor(root.left, root.left.left));
		assertTrue(FirstCommonAncestor.isAncestor(root.left, root.left.right));
		
		assertTrue(FirstCommonAncestor.isAncestor(root.right, root.right.left));
		assertTrue(FirstCommonAncestor.isAncestor(root.right, root.right.right));
		
		assertFalse(FirstCommonAncestor.isAncestor(root.left, root.right));
		assertFalse(FirstCommonAncestor.isAncestor(root.left, root.right.left));
		assertFalse(FirstCommonAncestor.isAncestor(root.left, root.right.right));
		
		assertFalse(FirstCommonAncestor.isAncestor(root.right, root.left));
		assertFalse(FirstCommonAncestor.isAncestor(root.right, root.left.right));
		assertFalse(FirstCommonAncestor.isAncestor(root.right, root.left.left));	
	}
	
	@Test
	public void testFindFCA() {
		assertEquals(root, FirstCommonAncestor.findFCA(root.left, root.right));
		assertEquals(root, FirstCommonAncestor.findFCA(root.left.left, root.right));
		assertEquals(root, FirstCommonAncestor.findFCA(root.left.right, root.right));
		assertEquals(root, FirstCommonAncestor.findFCA(root.left, root.right.left));
		assertEquals(root, FirstCommonAncestor.findFCA(root.left, root.right.right));
		
		assertEquals(root.left, FirstCommonAncestor.findFCA(root.left.left, root.left.right));
		assertEquals(root.right, FirstCommonAncestor.findFCA(root.right.left, root.right.right));
		
		assertEquals(root, FirstCommonAncestor.findFCA(root.left.left, root.right.left));
		assertEquals(root, FirstCommonAncestor.findFCA(root.left.right, root.right.left));
		assertEquals(root, FirstCommonAncestor.findFCA(root.left.left, root.right.right));
		assertEquals(root, FirstCommonAncestor.findFCA(root.left.right, root.right.right));
		
		assertEquals(root, FirstCommonAncestor.findFCA(root.left, root.left.left));
		assertEquals(root, FirstCommonAncestor.findFCA(root.left, root.left.right));
		
		assertEquals(null, FirstCommonAncestor.findFCA(root, root.left));
		assertEquals(null, FirstCommonAncestor.findFCA(root, root.left.left));
		assertEquals(null, FirstCommonAncestor.findFCA(root, root.left.right));
		assertEquals(null, FirstCommonAncestor.findFCA(root, root.right));
		assertEquals(null, FirstCommonAncestor.findFCA(root, root.right.left));
		assertEquals(null, FirstCommonAncestor.findFCA(root, root.right.right));
		
	}

}
