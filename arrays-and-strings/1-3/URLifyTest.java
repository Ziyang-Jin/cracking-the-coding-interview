import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class URLifyTest {
    @Test
    public void testSample() {
        String s = "Mr John Smith   ";
        int l = 13;
        assertEquals("Mr%20John%20Smith", URLify.urlify(s.toCharArray(), l));
    }

    @Test
    public void testSpace() {
    	String s = "   "; 
    	int l = 3;
    	assertEquals("%20%20%20", URLify.urlify(s.toCharArray(), l));
    }
    
    @Test
    public void testEmptyString() {
    	String s = "";
    	int l = 0;
    	assertEquals("", URLify.urlify(s.toCharArray(), l));
    }
}
