import java.util.ArrayList;
import java.util.List;


public class Calculator {
    private List<Integer> res;
    private List<Double> circle_res;

    // 3.14 반지름은 변하지 않는 값이라 변경할 수 없게 final을 사용하여 작성
    final double pi = 3.14;

    // 필드에 접근해 가져올수 있도록 Getter 메서드
    public List<Integer> getRes() {
        return res;
    }

    // 필드에 접근해 수정할 수 있도록
    public void setRes(List<Integer> res) {
        this.res = res;
    }


    public List<Double> getCircle_res() {
        return circle_res;
    }

    public void setCircle_res(List<Double> circle_res) {
        this.circle_res = circle_res;
    }

    public Calculator(){
        res = new ArrayList<>();
        circle_res = new ArrayList<>();
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

    public int calculate(int num1, int num2, char op) throws InputException {
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
                    throw new InputException();
                }
                result = num1/num2;
            }

            // case외에 다른 연산자가 들어오면 Exception 발생
            default -> throw new InputException();
        }
        res.add(result);

        return result;
    }

    public double calculateCircleArea(int r){
        double area = 0;

        area = r * r * pi;

        circle_res.add(area);
        return area;
    }

    public void circleInquiryResult(){
        System.out.println(getCircle_res());
    }
}

