import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestIsUnique {

	@Test
	public void testUniqueString() {
		String s = "qwertyuiopasdfghjklzxcvbnm";
		assertTrue(IsUnique.checkUniqueness(s));
	}
	
	@Test
	public void testNotUniqueString() {
		String s = "thisisnotunique";
		assertFalse(IsUnique.checkUniqueness(s));
	}
	
	@Test
	public void testSingleSpace() {
		String s = " ";
		assertTrue(IsUnique.checkUniqueness(s));
	}
	
	@Test
	public void testDoubleSpace() {
		String s = "  ";
		assertFalse(IsUnique.checkUniqueness(s));
	}
	
	@Test
	public void testEmpty() {
		String s = "";
		assertTrue(IsUnique.checkUniqueness(s));
	}
	
	@Test(expected = NullPointerException.class)
	public void testNull() {
		String s = null;
		IsUnique.checkUniqueness(s);
	}

}
