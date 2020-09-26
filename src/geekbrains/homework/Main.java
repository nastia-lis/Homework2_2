package geekbrains.homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            String[][] arrayTest = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"},
            };
            System.out.println(Arrays.deepToString(arrayTest));
            arrayList(arrayTest);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    static void arrayList(String[][] array) throws MyArrayDataException {
        int arrayLength = 4;
        int firstNumber = 0;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (array.length == arrayLength && array[i].length == arrayLength) {
                } else {
                    throw new MyArraySizeException(array.length);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int arrayNumber = Integer.parseInt(array[i][j]);
                firstNumber += arrayNumber;
                if(arrayNumber != Integer.parseInt(array[i][j])) {
                    throw new MyArrayDataException("В этой ячейке лежат неверные данные (координаты: x,y): " + i + j);
                }
            }
        }
        System.out.println("Сумма чисел в массиве: " + firstNumber);
    }
}
