import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    private List<Integer> res = new ArrayList<>();

    public int add(int x, int y) {
        return x+y;
    }

    public int sub(int x, int y){
        return x-y;
    }

    public int multi(int x, int y){
        return x * y;
    }

    public int divide(int x, int y){
        return x/y;
    }


    public int calculate(int num1, int num2, char op) throws InputExcetpion {
        int result = 0;

        switch (op){
            case '+' -> {
                result = add(num1, num2);
            }
            case '-' -> {
                result = sub(num1, num2);
            }
            case '*' -> {
                result = multi(num1, num2);
            }
            case '/' -> {
                if(num2 <= 0) {
                    throw new InputExcetpion();
                }
                result = divide(num1, num2);
            }

            default -> throw new InputExcetpion();
        }
        res.add(result);

        return result;
    }
}
