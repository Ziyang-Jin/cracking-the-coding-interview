import static org.junit.Assert.assertEquals;

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
		final int LOOP = 34;
		for (int i = 0; i < LOOP; i++) {
			sos.push(i);
		}
		assertEquals(SetOfStacks.STACK_SIZE-1, sos.popAt(0));
		assertEquals(2*SetOfStacks.STACK_SIZE, sos.popAt(1));
		assertEquals(3*SetOfStacks.STACK_SIZE+1, sos.popAt(2));
	}
}
