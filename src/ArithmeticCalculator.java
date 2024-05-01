// Circulator 상속


import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(List<Double> results){
        super(results);
    }

    public int calculate(int num1, int num2, char op) throws InputException {
        int result = 0;

        switch (op){
            case '+' -> result = num1 + num2;

            case '-' -> result = num1 - num2;

            case '*' -> result = num1 * num2;

            case '/' -> {
                //  분모가 0보다 작거나 같으면 Exception 발생
                if(num2 <= 0) {
                    throw new InputException();
                }
                result = num1/num2;
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
