package geekbrains.homework;

public class MyArrayDataException extends NumberFormatException {
    private  int cell_X;
    private int cell_Y;

    public int getCell_X() {
        return cell_X;
    }

    public int getCell_Y() {
        return cell_Y;
    }

    public MyArrayDataException(String s, int cell_X, int cell_Y) {
        super(s);
        this.cell_X = cell_X;
        this.cell_Y = cell_Y;
    }

    public MyArrayDataException(String s) {
        super(s);
    }
}
