// Circulator 상속


public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator() { }

    public int add(int x, int y) throws InputException {
        return calculate(x, y, '+');
    }

    public int sub(int x, int y) throws InputException {
        return calculate(x, y, '-');
    }

    public int multi(int x, int y) throws InputException {
        return calculate(x, y, '*');
    }

    public int divide(int x, int y) throws InputException {
        return calculate(x, y, '/');
    }

    public void ArithmeticResults() {
        inquiryResults();
    }

    public void remove() {
        removeResult();
    }
}
