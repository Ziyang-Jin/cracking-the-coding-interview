import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrCompressionTest {

    @Test
    public void testSimple() {
        assertEquals("", StrCompression.compress(""));
        assertEquals("a", StrCompression.compress("a"));
        assertEquals("aa", StrCompression.compress("aa"));
        assertEquals("a3", StrCompression.compress("aaa"));
        assertEquals("a4", StrCompression.compress("aaaa"));
    }
    
    @Test
    public void testSample() {
        assertEquals("a2b1c5a3", StrCompression.compress("aabcccccaaa"));
        assertEquals("a2b2c3", StrCompression.compress("aabbccc"));
        assertEquals("aabbcc", StrCompression.compress("aabbcc"));
    }

    @Test
    public void testUpperCase() {
        assertEquals("B2D2B4C1", StrCompression.compress("BBDDBBBBC"));
        assertEquals("AAAAADEB", StrCompression.compress("AAAAADEB"));
        assertEquals("A5D1E1B2", StrCompression.compress("AAAAADEBB"));
    }
    
    @Test
    public void testMixed() {
        assertEquals("AbcDff", StrCompression.compress("AbcDff"));
        assertEquals("AbbbcDDDff", StrCompression.compress("AbbbcDDDff"));
        assertEquals("A1b3c1D4f2", StrCompression.compress("AbbbcDDDDff"));
    }

}
