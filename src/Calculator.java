import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Calculator {
    private List<Integer> res;

    // 필드에 접근해 가져올수 있도록 Getter 메서드
    public List<Integer> getRes() {
        return res;
    }

    // 필드에 접근해 수정할 수 있도록
    public void setRes(List<Integer> res) {
        this.res = res;
    }

    // 가장 오래된 값을 지워야 하기때문에 인덱스 0
    public void removeResult(){
        if(!res.isEmpty()){
            res.remove(0);
        }
    }

    public void inquiryResults(){
        System.out.println(getRes());
    }

    // 결과 초기화.
    public Calculator(){
        res = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char op) throws InputExcetpion {
        int result = 0;

        switch (op){
            case '+' -> {
                result = num1 + num2;
                break;
            }
            case '-' -> {
                result = num1 - num2;
                break;
            }
            case '*' -> {
                result = num1 * num2;
                break;
            }
            case '/' -> {
                //  분모가 0보다 작거나 같으면 Exception 발생
                if(num2 <= 0) {
                    throw new InputExcetpion();
                }
                result = num1/num2;
            }

            // case외에 다른 연산자가 들어오면 Exception 발생
            default -> throw new InputExcetpion();
        }
        res.add(result);

        return result;
    }
}
