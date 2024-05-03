// Circulator 상속


import java.util.List;

public class ArithmeticCalculator extends Calculator  {

    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }


    public double calculate(int num1, int num2, char op) throws InputException {
        return operatorFactory(op).operate(num1, num2);
    }


    //
    private Operator operatorFactory(char op) throws InputException{
        return switch (op){
            case '+' -> new AddOperator();
            case '-' -> new SubOperator();
            case '*' -> new MultiOperator();
            case '/' -> new DivideOperator();
            case '%' -> new ModOperator();
            default -> throw new InputException();
        };
    }

    @Override
    void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("연산 결과 : " + result);
        }
    }

}
