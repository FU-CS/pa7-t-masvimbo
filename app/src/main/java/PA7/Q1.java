package PA7;

public class Q1 {

    // Rotates the matrix by 90 degrees clockwise
    public void rotateImage(int[][] matrix) {
        int n = matrix.length;
        if (n == 0)
            return; 
            
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();

        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix by 90 degrees
        q1.rotateImage(matrix);

        System.out.println("Rotated Matrix (90 degrees clockwise):");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j ++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

