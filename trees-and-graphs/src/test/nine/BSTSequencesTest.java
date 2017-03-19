package test.nine;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import definitions.IntNode;
import nine.BSTSequences;

public class BSTSequencesTest {
	IntNode root;
	
	@Before
	public void setUp() {
		root = new IntNode(4);
		root.left = new IntNode(2);
		root.right = new IntNode(6);
		root.left.left = new IntNode(1);
		root.left.right = new IntNode(3);
		root.right.left = new IntNode(5);
		root.right.right = new IntNode(7);
		
	}

	@Test
	public void test() {
		BSTSequences.printAllPossibleArrays(root);
	}
	
	@Test
	public void testGenerateCandidates() {
		ArrayList<Integer> current = new ArrayList<Integer>();
		current.add(4);
		current.add(2);
		List<Integer> result = BSTSequences.generateCandidates(current, root);
		assertEquals(3, result.size());
		BSTSequences.printArray(result);
		current.add(1);
		List<Integer> result2 = BSTSequences.generateCandidates(current, root);
		assertEquals(2, result2.size());
		BSTSequences.printArray(result2);
	}

}
