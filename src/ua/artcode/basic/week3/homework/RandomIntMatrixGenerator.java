package ua.artcode.basic.week3.homework;

import ua.artcode.basic.utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by olsas on 3/14/2016.
 * <p>
 * 3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 */
public class RandomIntMatrixGenerator {
    public static int[][] generateRandomIntMatrix(int lineAmount, int rowAmount) {
        int[][] matrix = new int[lineAmount][rowAmount];
        for (int i = 0; i < lineAmount; i++) {
            for (int j = 0; j < rowAmount; j++) {
                matrix[i][j] = ArrayUtils.getRandomNum(100);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] testGenerateRandomIntMatrix = generateRandomIntMatrix(8, 9);
        System.out.println(Arrays.deepToString(testGenerateRandomIntMatrix));
    }
}


