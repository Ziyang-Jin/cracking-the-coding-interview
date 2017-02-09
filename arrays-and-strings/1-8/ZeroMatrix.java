import java.util.HashSet;

public class ZeroMatrix {
    
    public static class Info {
        public HashSet<Integer> cols;
        public HashSet<Integer> rows;
        
        public Info() {
            cols = new HashSet<Integer>();
            rows = new HashSet<Integer>();
        }
    }
    
    public static void zeroMatrix(int[][] matrix, int m, int n) {
        Info info = scanMatrix(matrix, m, n);
        setZero(matrix, m, n, info);
    }
    
    private static Info scanMatrix(int[][] matrix, int m, int n) {
        Info info = new Info();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    info.cols.add(j);
                    info.rows.add(i);
                }
            }
        }
        return info;
    }
    
    private static void setZero(int[][] matrix, int m, int n, Info info) {
        for (int i = 0; i < m; i++) {
            if (info.cols.contains(i)) {
                clearCol(matrix, m, i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (info.rows.contains(i)) {
                clearRow(matrix, n, i);
            }
        }
    }
    
    // m is the number of rows
    private static void clearCol(int[][] matrix, int m, int col) {
        for (int i = 0; i < m; i++) {
            matrix[i][col] = 0;
        }
    }
    
    // n is the number of columns
    private static void clearRow(int[][] matrix, int n, int row) {
        for (int i = 0; i < n; i++) {
            matrix[row][i] = 0;
        }
    }
    
    public static int[][] makeMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        int x = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = x++;
            }
        }
        return matrix;
    }
    
    public static void printMatrix(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}
