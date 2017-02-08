import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class URLifyTest {
    @Test
    public void testSample() {
        assertEquals("Mr%20John%20Smith", URLify.urlify(("Mr John Smith   ").toCharArray(), 13));
    }

    @Test
    public void testSpace() {
        assertEquals("%20%20%20", URLify.urlify(("   ").toCharArray(), 3));
    }
    
    @Test
    public void testEmptyString() {
        assertEquals("", URLify.urlify(("").toCharArray(), 0));
    }
}
