package Lesson3;

public class MyArrayDataException extends MyException {
    private int i, j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String getMessage() {
        return "Incorrect data in [" + i + "]" + "[" + j + "]";
    }
}
