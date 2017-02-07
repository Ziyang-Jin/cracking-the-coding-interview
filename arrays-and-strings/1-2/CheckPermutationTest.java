import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CheckPermutationTest {
    @Test
    public void sameString() {
        String first = "abcde";
        String second = "bdcae";
        assertTrue(CheckPermutation.check(first, second));
    }
    
    @Test
    public void differentString() {
        String first = "asdfg";
        String second = "adfgw";
        assertFalse(CheckPermutation.check(first, second));
    }
    
    @Test
    public void differentLength() {
        String first = "one";
        String second = "three";
        assertFalse(CheckPermutation.check(first, second));
    }
    
    @Test
    public void twoEmtpyStrings() {
        String first = "";
        String second = "";
        assertTrue(CheckPermutation.check(first, second));
    }
    
    @Test
    public void twoSpaceStrings() {
        String first = " ";
        String second = " ";
        assertTrue(CheckPermutation.check(first, second));
    }
    
    @Test(expected = NullPointerException.class)
    public void oneNullString() {
        String first = null;
        String second = "abc";
        CheckPermutation.check(first, second);
    }
    
    @Test(expected = NullPointerException.class)
    public void twoNullStrings() {
        String first = null;
        String second = null;
        CheckPermutation.check(first, second);
    }
}
