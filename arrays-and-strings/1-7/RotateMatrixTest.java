import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateMatrixTest {

    @Test
    public void testSimple() {
        int n = 2;
        int[][] m = RotateMatrix.makeMatrix(n);
        int[][] expect = new int[n][n];
        hardCodeExpect(expect);
        assertArrayEquals(expect, RotateMatrix.rotate(m, n));
    }
    
    private void hardCodeExpect(int[][] expect) {
        expect[0][0] = 3;
        expect[0][1] = 1;
        expect[1][0] = 4;
        expect[1][1] = 2;
    }
    
    @Test
    public void testCircle() {
        int n = 3;
        int[][] m = RotateMatrix.makeMatrix(n);
        int[][] expect = RotateMatrix.rotate(m, n);
        for (int i = 0; i < 3; i++) {
            expect = RotateMatrix.rotate(expect, n);
        }
        assertArrayEquals(expect, m);
    }

}
