package test.seven;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import definitions.Pair;
import seven.BuildOrder;

public class BuildOrderTest {
	List<String> projects;
	List<Pair> dependencies;
	
	@Before
	public void setUp() {
		projects = new ArrayList<String>();
		projects.add("a");
		projects.add("b");
		projects.add("c");
		projects.add("d");
		projects.add("e");
		projects.add("f");
		Pair one = new Pair("a", "d");
		Pair two = new Pair("f", "b");
		Pair three = new Pair("b", "d");
		Pair four = new Pair("f", "a");
		Pair five = new Pair("d", "c");
		dependencies = new ArrayList<Pair>();
		dependencies.add(one);
		dependencies.add(two);
		dependencies.add(three);
		dependencies.add(four);
		dependencies.add(five);
		
	}

	@Test
	public void test() {
		List<String> result = BuildOrder.computeBuildOrder(projects, dependencies);
		printResult(result);
//		assertEquals("f", result.get(0));
//		assertEquals("e", result.get(1));
//		assertEquals("a", result.get(2));
	}
	
	public void printResult(List<String> result) {
		System.out.print("Result: ");
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}

}
