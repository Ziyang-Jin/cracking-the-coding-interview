import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ZeroMatrixTest {

    @Test
    public void test() {
        int m = 2;
        int n = 2;
        int[][] matrix = createTestMatrix(m, n);
        int[][] expect = hardCodeExpect(m, n);
        ZeroMatrix.zeroMatrix(matrix, m, n);
        assertArrayEquals(expect, matrix);
    }
    
    private int[][] createTestMatrix(int m, int n) {
        int[][] matrix = ZeroMatrix.makeMatrix(m, n);
        matrix[0][0] = 0;
        return matrix;
    }
    
    private int[][] hardCodeExpect(int m, int n) {
        int[][] expect = new int[m][n];
        expect[1][1] = 4;
        return expect;
    }

}
