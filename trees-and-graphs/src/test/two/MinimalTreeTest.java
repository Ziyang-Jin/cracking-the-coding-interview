package test.two;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import definitions.IntNode;
import two.MinimalTree;

public class MinimalTreeTest {
	final int ODD_NUMBER = 9;
	final int EVEN_NUMBER = 10;
	int arrayOdd[];
	int arrayEven[];
	
	@Before
	public void setUp() {
		arrayOdd = new int[ODD_NUMBER];
		for (int i = 0; i < ODD_NUMBER; i++) {
			arrayOdd[i] = i+1;
		}
		arrayEven = new int[EVEN_NUMBER];
		for (int i = 0; i < EVEN_NUMBER; i++) {
			arrayEven[i] = i+1;
		}
	}
	

	@Test
	public void testOdd() {
		IntNode oddTree = MinimalTree.generateMinialTree(arrayOdd);
		System.out.println("\n->odd tree:");
		IntNode.printNode(oddTree, 0);
	}
	
	@Test
	public void testEven() {
		IntNode evenTree = MinimalTree.generateMinialTree(arrayEven);
		System.out.println("\n->even tree:");
		IntNode.printNode(evenTree, 0);
	}

}
