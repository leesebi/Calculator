// Circulator 상속


import java.util.List;

public class ArithmeticCalculator extends Calculator  {

    private final AddOperator addOperator; //반드시 초기화해야함 !!!!!!
    private final SubOperator subOperator;
    private final MultiOperator multiOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator(List<Double> results, AddOperator addOperator, SubOperator subOperator, MultiOperator multiOperator, DivideOperator divideOperator) {
        super(results);
        this.addOperator = addOperator;
        this.subOperator = subOperator;
        this.multiOperator = multiOperator;
        this.divideOperator = divideOperator;
    }


    public int calculate(int num1, int num2, char op) throws InputException {
        int result = 0;

        switch (op){
            case '+' -> result = addOperator.operate(num1, num2);

            case '-' -> result = subOperator.operate(num1, num2);

            case '*' -> result = multiOperator.operate(num1, num2);

            case '/' -> {
                //  분모가 0보다 작거나 같으면 Exception 발생
                if(num2 <= 0) {
                    throw new InputException();
                }
                result = divideOperator.operate(num1, num2);
            }

            // case외에 다른 연산자가 들어오면 Exception 발생
            default -> throw new InputException();
        }
        return result;
    }

    @Override
    void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("연산 결과 : " + result);
        }
    }

}
