import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testSample() {
        assertFalse(Palindrome.check("tact coa"));
        assertFalse(Palindrome.check("taco cat"));
        assertFalse(Palindrome.check("atco cta"));
        
        assertTrue(Palindrome.check("tactcoa"));
        assertTrue(Palindrome.check("tacocat"));
        assertTrue(Palindrome.check("atcocta"));
    }
    
    @Test
    public void testOdd() {
        assertTrue(Palindrome.check("abcba"));
        assertTrue(Palindrome.check("aabbc"));
        assertTrue(Palindrome.check("cabba"));
        
        assertFalse(Palindrome.check("lmnop"));
        assertFalse(Palindrome.check("nlmpo"));
        assertFalse(Palindrome.check("omnpl"));
    }
    
    @Test
    public void testEven() {
        assertTrue(Palindrome.check("aabbcc"));
        assertTrue(Palindrome.check("babacc"));
        assertTrue(Palindrome.check("cbaacb"));
        
        assertFalse(Palindrome.check("jkeeij"));
        assertFalse(Palindrome.check("eijjke"));
        assertFalse(Palindrome.check("kjeikj"));
    }
    
    @Test
    public void testSingleChar() {
        assertTrue(Palindrome.check(" "));
        assertTrue(Palindrome.check("x"));
    }
    
    @Test
    public void testDoubleChars() {
        assertTrue(Palindrome.check("ss"));
        assertTrue(Palindrome.check("**"));
        
        assertFalse(Palindrome.check("sh"));
        assertFalse(Palindrome.check("o>"));
    }

}
