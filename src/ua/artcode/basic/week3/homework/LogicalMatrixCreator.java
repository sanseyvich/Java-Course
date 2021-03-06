package ua.artcode.basic.week3.homework;

import java.util.Arrays;

/**
 * Created by olsas on 3/14/2016.
 * <p>
 * 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 */
public class LogicalMatrixCreator {
    public static boolean[][] createMatrixWhereEqualRowAndLineElementsWouldBeTrue(int lineAmount, int rowAmount) {
        boolean[][] matrix = new boolean[lineAmount][rowAmount];
        for (int i = 0; i < lineAmount; i++) {
            for (int j = 0; j < rowAmount; j++) {
                matrix[i][j] = i == j ? true : false;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        boolean[][] testMatrix = createMatrixWhereEqualRowAndLineElementsWouldBeTrue(5, 8);
        System.out.println(Arrays.deepToString(testMatrix));
    }
}
