import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class IsUniqueTest {

    @Test
    public void testUniqueString() {
        assertTrue(IsUnique.checkUniqueness("qwertyuiopasdfghjklzxcvbnm"));
    }
    
    @Test
    public void testNotUniqueString() {
        assertFalse(IsUnique.checkUniqueness("thisisnotunique"));
    }
    
    @Test
    public void testSingleSpace() {
        assertTrue(IsUnique.checkUniqueness(" "));
    }
    
    @Test
    public void testDoubleSpace() {
        assertFalse(IsUnique.checkUniqueness("  "));
    }
    
    @Test
    public void testEmpty() {
        assertTrue(IsUnique.checkUniqueness(""));
    }
    
    @Test(expected = NullPointerException.class)
    public void testNull() {
        IsUnique.checkUniqueness(null);
    }

}
