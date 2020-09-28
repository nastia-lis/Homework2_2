package geekbrains.homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][] arrayTest = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14n", "15", "16"},
        };
        try {
            System.out.println(Arrays.deepToString(arrayTest));
            System.out.println("Сумма чисел в массиве: " + arrayList(arrayTest));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getCell_X() + " " + e.getCell_Y());
        }
    }

    static int arrayList(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int arrayLength = 4;
        int arraySum = 0;
        int arrayNumber;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (array.length == arrayLength && array[i].length == arrayLength) {
                } else {
                    throw new MyArraySizeException();
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayNumber = Integer.parseInt(array[i][j]);
                    arraySum += arrayNumber;
                } catch ( NumberFormatException e) {
                    throw new MyArrayDataException("В этой ячейке лежат неверные данные (координаты: x, y): " + i + " " + j, i, j);
                }
            }
        }
        //        System.out.println("Сумма чисел в массиве: " + arrayNumber);
        return arraySum;
    }
}
