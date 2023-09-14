public class Lab2 {
    public static void main(String[] args) {
        int studentBook = 1106; 
        int C5 = studentBook % 5; // 1 => Транспонувати
        int C7 = studentBook % 7; // 0 => double
        int C11 = studentBook % 11; // 6 => Обчислити суму найбільших елементів в стовпцях матриці з парними номерами та найменших елементів в стовпцях матриці з непарними номерами 
        System.out.println("C5:" + C5); 
        System.out.println("C7:" + C7);
        System.out.println("C11:" + C11);
        try {
            double[][] matrix = {
                {1.0, 2.0, 3.0, 4.0},
                {5.0, 6.0, 7.0, 8.0,},
                {9.0, 10.0, 11.0, 12.0},
                {13.0, 14.0, 15.0, 16.0},
            };
            if (!isRectangularMatrix(matrix)) {
                System.out.println("Матриця не прямокутна");
                return;
            }
            double[][] transposedMatrix = transposeMatrix(matrix);

            System.out.println("Транспонована матриця:");
            printMatrix(transposedMatrix);

            double sumMaxEven = sumMaxElementsInEvenColumns(transposedMatrix);
            double sumMinOdd = sumMinElementsInOddColumns(transposedMatrix);

            System.out.println("Сума найбiльших елементiв в стовпцях з парними номерами: " + sumMaxEven);
            System.out.println("Сума найменших елементiв в стовпцях з непарними номерами: " + sumMinOdd);
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }

    public static double[][] transposeMatrix(double[][] matrix) {
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

    public static double sumMaxElementsInEvenColumns(double[][] matrix) {
        try {
            int columns = matrix[0].length;
            double sum = 0;
    
            for (int j = 0; j < columns; j += 2) {
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
    
    public static double sumMinElementsInOddColumns(double[][] matrix) {
        try {
            int columns = matrix[0].length;
            double sum = 0;
    
            for (int j = 1; j < columns; j += 2) {
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

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static boolean isRectangularMatrix(double[][] matrix) {
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
