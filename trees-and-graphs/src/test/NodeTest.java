package test;

import static org.junit.Assert.*;

import definitions.Node;

import org.junit.Test;

public class NodeTest {

	@Test
	public void test() {
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		a.addChild(b);
		a.addChild(c);
		a.addChild(d);
		Node aCopy = new Node("a");
		Node.printNode(a, 0);
		assertFalse(aCopy.equals(a));
		aCopy.addChild(b);
		assertFalse(aCopy.equals(a));
		aCopy.addChild(c);
		assertFalse(aCopy.equals(a));
		aCopy.addChild(new Node("d"));
		assertTrue(aCopy.equals(a));
	}

}
