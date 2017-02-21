import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackMinTest {
	StackMin sm;
	
	@Before
	public void setUp() {
		sm = new StackMin();
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void testException1() {
		sm.pop();
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testException2() {
		sm.min();
	}
	
	@Test
	public void testPushAndPop() {
		final int FIRST = 1;
		final int SECOND = 2;
		sm.push(FIRST);
		sm.push(SECOND);
		int x = sm.pop();
		assertEquals(SECOND, x);
		x = sm.pop();
		assertEquals(FIRST, x);
	}
	
	@Test
	public void testMin() {
		final int MIN = -1;
		for (int i = 0; i < 10; i++) {
			sm.push(i);
		}
		sm.push(MIN);
		for (int i = 0; i < 10; i++) {
			sm.push(i);
		}
		assertEquals(MIN, sm.min());
	}

}
