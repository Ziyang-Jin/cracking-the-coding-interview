import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyQueueTest {
	MyQueue<Integer> mq;
	
	@Before
	public void setUp() {
		mq = new MyQueue<Integer>();
	}

	@Test
	public void test() {
		assertTrue(mq.isEmpty());
		for (int i = 0; i < 10; i++) {
			mq.add(i);
		}
		assertFalse(mq.isEmpty());
		for (int i = 0; i < 10; i++) {
		    assertEquals(i, (int) mq.remove());
		}
		assertTrue(mq.isEmpty());
	}

}
