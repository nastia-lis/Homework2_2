package geekbrains.homework;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private int arrayLength;

    public MyArraySizeException(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public MyArraySizeException(String s, int arrayLength) {
        super(s);
        this.arrayLength = arrayLength;
    }
}
