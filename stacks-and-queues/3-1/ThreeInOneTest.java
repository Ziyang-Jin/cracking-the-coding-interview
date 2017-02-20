import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

public class ThreeInOneTest {
	private ThreeInOne tio;
	
	@Before
	public void prepare() {
		tio = new ThreeInOne();
	}

	@Test
	public void testEmpty() {
		assertTrue(tio.isEmpty(1));
		assertTrue(tio.isEmpty(2));
		assertTrue(tio.isEmpty(3));
	}
	
	@Test
	public void testPushPop() throws StackOverflowException {
		int x = 5;
		tio.push(1, x);
		assertEquals(x, tio.pop(1));
		assertTrue(tio.isEmpty(1));
	}
	
	@Test (expected = StackOverflowException.class)
	public void testStackOverflow() throws StackOverflowException {
		for (int i = 0; i < ThreeInOne.STACK_SIZE + 1; i++) {
			tio.push(1, 1);
		}
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testException1() {
	    tio.isEmpty(0);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testException2() {
	    tio.isEmpty(4);
	}
	
	@Test (expected = EmptyStackException.class)
	public void testException3() throws EmptyStackException {
	    tio.pop(1);
	}
	
	@Test (expected = EmptyStackException.class)
	public void testException4() throws EmptyStackException {
	    tio.pop(2);
	}
	
	@Test (expected = EmptyStackException.class)
	public void testException5() throws EmptyStackException {
	    tio.pop(3);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testException6() throws EmptyStackException {
	    tio.pop(4);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testException7() throws EmptyStackException {
	    tio.pop(0);
	}

}
