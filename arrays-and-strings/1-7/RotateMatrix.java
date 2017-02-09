public class RotateMatrix {
    // assume rotate right
    public static int[][] rotate(int[][] m, int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n-i-1] = m[i][j];
            }
        }
        return result;
    }
    
    public static int[][] makeMatrix(int n) {
        int[][] m = new int[n][n];
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = x++;
            }
        }
        return m;
    }
    
    public static void printMatrix(int[][] m, int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}
