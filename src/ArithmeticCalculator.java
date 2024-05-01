// Circulator 상속
public class ArithmeticCalculator extends Calculator {
    private Calculator calculator;

    public ArithmeticCalculator() {
        calculator = new Calculator();
    }

    public int add(int x, int y) throws InputExcetpion {
        return calculator.calculate(x, y, '+');
    }

    public int sub(int x, int y) throws InputExcetpion {
        return calculator.calculate(x, y, '-');
    }

    public int multi(int x, int y) throws InputExcetpion {
        return calculator.calculate(x, y, '*');
    }

    public int divide(int x, int y) throws InputExcetpion {
        return calculator.calculate(x, y, '/');
    }

    public void inquiryResults() {
        calculator.inquiryResults();
    }

    public void remove() {
        calculator.removeResult();
    }
}
