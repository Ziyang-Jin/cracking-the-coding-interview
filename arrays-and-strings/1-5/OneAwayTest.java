import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class OneAwayTest {

    @Test
    public void testSample() {
        assertTrue(OneAway.check("pale", "ple"));
        assertTrue(OneAway.check("pales", "pale"));
        assertTrue(OneAway.check("pale", "bale"));
        
        assertFalse(OneAway.check("pale", "bake"));
    }
    
    @Test
    public void testSimple() {
        assertTrue(OneAway.check("", "a"));
        assertTrue(OneAway.check("a", ""));
        
        assertTrue(OneAway.check("", ""));
        assertTrue(OneAway.check(" ", " "));
    }
    
    @Test
    public void testFailure() {
        assertFalse(OneAway.check("a", "aaa"));
        assertFalse(OneAway.check("watermelon", "ginerale"));
        assertFalse(OneAway.check("abcde", "adcbb"));
        assertFalse(OneAway.check("#cool#", " cool "));
    }

}
