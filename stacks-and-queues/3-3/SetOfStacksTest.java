import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SetOfStacksTest {
    private SetOfStacks sos;
    
    @Before
    public void setUp() {
    	sos = new SetOfStacks();
    }
    
	@Test
	public void test() {
		final int LOOP = 33;
		for (int i = 0; i < LOOP; i++) {
			sos.push(i);
		}
		assertEquals(LOOP-1, sos.pop());
		assertEquals(LOOP-2, sos.pop());
		assertEquals(LOOP-3, sos.pop());
		assertEquals(LOOP-4, sos.pop());
		assertEquals(LOOP-5, sos.pop());
	}

	@Test
	public void testPopAt() {
		final int LOOP = 32;
		for (int i = 0; i < LOOP; i++) {
			sos.push(i);
		}
		assertEquals(9, sos.popAt(0));
		assertEquals(20, sos.popAt(1));
	}
}
