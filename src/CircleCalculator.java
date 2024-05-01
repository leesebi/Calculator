
// Circulator 상속
public class CircleCalculator extends Calculator {

    private Calculator calculator;

    public CircleCalculator() {
        calculator = new Calculator();
    }

    public double CircleArea(int r) {
        return calculator.calculateCircleArea(r);
    }

    public void result() {
        calculator.circleInquiryResult();
    }

}
