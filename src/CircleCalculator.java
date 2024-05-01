import java.util.List;

// Circulator 상속
public class CircleCalculator extends Calculator {

    private static final double PI = 3.14;

    public CircleCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(int radius){
        return PI * radius * radius;
    }

    @Override
    void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("원의 넓이 : " + result);
        }
    }
}
