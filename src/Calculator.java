import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> res = new ArrayList<>();
    public int calculate(int num1, int num2, char op) throws InputExcetpion {
        int result = 0;

        switch (op){
            case '+' -> {
                result = num1 + num2;
            }
            case '-' -> {
                result = num1 - num2;
            }
            case '*' -> {
                result = num1 * num2;
            }
            case '/' -> {
                if(num2 <= 0) {
                    throw new InputExcetpion();
                }

                result = num1 / num2;
            }
            default -> throw new InputExcetpion();
        }
        res.add(result);

        return result;
    }
}
