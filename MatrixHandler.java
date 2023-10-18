public class MatrixHandler {
    public double[][] transposeMatrix(double[][] matrix) {
        try {
            int rows = matrix.length;
            int columns = matrix[0].length;
    
            double[][] result = new double[columns][rows];
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[j][i] = matrix[i][j];
                }
            }
    
            return result;
        } catch (Exception e) {
            System.err.println("Помилка при транспонуванні матрицi: " + e.getMessage());
            return null;
        }
    }

    public double sumMaxElementsInEvenColumns(double[][] matrix) {
        try {
            int columns = matrix[0].length;
            double sum = 0;
    
            for (int j = 1; j < columns; j += 2) {
                double max = matrix[0][j];
                for (int i = 1; i < matrix.length; i++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
                sum += max;
            }
    
            return sum;
        } catch (Exception e) {
            System.err.println("Помилка при обчисленнi суми найбiльших елементiв: " + e.getMessage());
            return -1;
        }
    }
    
    public double sumMinElementsInOddColumns(double[][] matrix) {
        try {
            int columns = matrix[0].length;
            double sum = 0;
    
            for (int j = 0; j < columns; j += 2) {
                double min = matrix[0][j];
                for (int i = 1; i < matrix.length; i++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }
                }
                sum += min;
            }
    
            return sum;
        } catch (Exception e) {
            System.err.println("Помилка при обчисленнi суми найменших елементiв: " + e.getMessage());
            return -1;
        }
    }

    public void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public boolean isRectangularMatrix(double[][] matrix) {
        int numRows = matrix.length;
        int numColumns = matrix[0].length;
    
        for (int i = 1; i < numRows; i++) {
            if (matrix[i].length != numColumns) {
                return false;
            }
        }
    
        return true;
    }
}
