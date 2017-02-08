import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CheckPermutationTest {
    @Test
    public void sameString() {
        assertTrue(CheckPermutation.check("abcde", "bdcae"));
    }
    
    @Test
    public void differentString() {
        assertFalse(CheckPermutation.check("asdfg", "adfgw"));
    }
    
    @Test
    public void differentLength() {
        assertFalse(CheckPermutation.check("one", "three"));
    }
    
    @Test
    public void twoEmtpyStrings() {
        assertTrue(CheckPermutation.check("", ""));
    }
    
    @Test
    public void twoSpaceStrings() {
        assertTrue(CheckPermutation.check(" ", " "));
    }
    
    @Test(expected = NullPointerException.class)
    public void oneNullString() {
        CheckPermutation.check(null, "abc");
    }
    
    @Test(expected = NullPointerException.class)
    public void twoNullStrings() {
        CheckPermutation.check(null, null);
    }
}
