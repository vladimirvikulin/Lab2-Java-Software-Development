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
            MatrixHandler matrixHandler = new MatrixHandler();
            System.out.println("Початкова матриця:");
            matrixHandler.printMatrix(matrix);

            if (!matrixHandler.isRectangularMatrix(matrix)) {
                System.out.println("Матриця не прямокутна");
                return;
            }
            double[][] transposedMatrix = matrixHandler.transposeMatrix(matrix);

            System.out.println("Транспонована матриця:");
            matrixHandler.printMatrix(transposedMatrix);

            double sumMaxEven = matrixHandler.sumMaxElementsInEvenColumns(transposedMatrix);
            double sumMinOdd = matrixHandler.sumMinElementsInOddColumns(transposedMatrix);

            System.out.println("Сума найбiльших елементiв в стовпцях з парними номерами: " + sumMaxEven);
            System.out.println("Сума найменших елементiв в стовпцях з непарними номерами: " + sumMinOdd);
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
            System.out.println("StackTrace:");
            e.printStackTrace();
        }
    }
}
