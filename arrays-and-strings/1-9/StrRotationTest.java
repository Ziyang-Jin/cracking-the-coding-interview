import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StrRotationTest {

    @Test
    public void testSample() {
        testRotation("");
        testRotation("a");
        testRotation("is");
        testRotation("pen");
        testRotation("apple");
        testRotation("banana");
        testRotation("pineapple");
        testRotation("strawberry");
        testRotation("waterbottle");
        testRotation("wintermelon");
        testRotation("chocolatecake");
    }
    
    private void testRotation(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            String s2 = s1.substring(i) + s1.substring(0, i);
            assertTrue(StrRotation.isRotation(s1, s2));
        }
    }

}
