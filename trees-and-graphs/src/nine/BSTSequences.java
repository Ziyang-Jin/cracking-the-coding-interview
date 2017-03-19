package nine;

import java.util.ArrayList;
import java.util.List;

import definitions.IntNode;

public class BSTSequences {
/**
 *        4
 *      2   6
 *     1 3 5 7
 */
	// IntNode root is a Binary Search Tree
	public static void printAllPossibleArrays(IntNode root) {
		//List<List<Integer>> results = findAllPermutations(root);
		List<List<Integer>> results = hardMode(root, new ArrayList<Integer>());
		for (int i = 0; i < results.size(); i++) {
			System.out.print((i+1) + ": ");
			printArray(results.get(i));
		}
	}
	
	public static List<List<Integer>> findAllPermutations(IntNode root) {
		if (root == null) {
			return new ArrayList<List<Integer>>();
		}
        List<List<Integer>> leftResults = findAllPermutations(root.left);
        List<List<Integer>> rightResults = findAllPermutations(root.right);
        
        List<List<Integer>> leftRight = new ArrayList<List<Integer>>();
        for (int i = 0; i < leftResults.size(); i++) {
        	List<Integer> leftResult = copyList(leftResults.get(i));
        	for (int j = 0; j < rightResults.size(); j++) {
        		List<Integer> newResult = copyList(leftResult);
        		newResult.addAll(copyList(rightResults.get(j)));
        		leftRight.add(newResult);
        	}
        }
        
        List<List<Integer>> rightLeft = new ArrayList<List<Integer>>();
        for (int i = 0; i < rightResults.size(); i++) {
        	List<Integer> rightResult = copyList(rightResults.get(i));
        	for (int j = 0; j < leftResults.size(); j++) {
        		List<Integer> newResult = copyList(rightResult);
        		newResult.addAll(copyList(leftResults.get(j)));
        		rightLeft.add(newResult);
        	}
        }
        
        List<List<Integer>> totalResult = new ArrayList<List<Integer>>();
        for (int i = 0; i < leftRight.size(); i++) {
        	totalResult.add(leftRight.get(i));
        }
        for (int i = 0; i < rightLeft.size(); i++) {
        	totalResult.add(rightLeft.get(i));
        }
        
        for (int i = 0; i < totalResult.size(); i++) {
        	List<Integer> singleResult = totalResult.get(i);
        	singleResult.add(0, root.val);
        }
        if (totalResult.isEmpty()) {
        	List<Integer> l = new ArrayList<Integer>();
        	l.add(root.val);
        	totalResult.add(l);
        }
        return totalResult;
	}
	
	public static void printArray(List<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println();
	}
	
	public static List<Integer> copyList(List<Integer> origin) {
		ArrayList<Integer> copy = new ArrayList<Integer>();
		for (int i = 0; i < origin.size(); i++) {
			copy.add(origin.get(i));
		} 
		return copy;
	}
	
	public static List<Integer> generateCandidates(List<Integer> current, IntNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		if (current.contains(root.val)) {
			List<Integer> leftResult = generateCandidates(current, root.left);
			List<Integer> rightResult = generateCandidates(current, root.right);
			result.addAll(leftResult);
			result.addAll(rightResult);
		} else {
			result.add(root.val);
		}
		return result;
	}
	
	public static List<List<Integer>> hardMode(IntNode root, List<Integer> current) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return new ArrayList<List<Integer>>();
		}
		List<Integer> candidates = generateCandidates(current, root);
		if (candidates.isEmpty()) {
			result.add(current);
			return result;
		}
		for (int i = 0; i < candidates.size(); i++) {
			List<Integer> copyCurr = copyList(current);
			copyCurr.add(candidates.get(i));
			List<List<Integer>> oneResult = hardMode(root, copyCurr);
			result.addAll(oneResult);
		}
		return result;
	}
}
