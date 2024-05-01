import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws InputExcetpion{
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        while(flag){
            System.out.print("1: 사칙연산 2: 원의 넓이 ");
            int n = sc.nextInt();

            // 사칙연산
            if(n == 1){
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                int result = 0;
                switch (operator){
                    case '+' -> {
                        result = arithmeticCalculator.add(num1, num2);
                    }
                    case '-' -> {
                        result = arithmeticCalculator.sub(num1, num2);
                    }
                    case '/' -> {
                        result = arithmeticCalculator.divide(num1, num2);
                    }
                    case '*' -> {
                        result = arithmeticCalculator.multi(num1, num2);
                    }
                    default -> throw new InputExcetpion();
                }
                // 값 삭제
                System.out.print("제일 오래된 데이터를 삭제하시겠습니까? (네 / 아니오) ");
                String re = sc.next();
                if(re.equals("네")) {
                    arithmeticCalculator.remove();
                }

                // 데이터 값 확인
                System.out.print("데이터를 확인하시겠습니까? (네 / 아니오) ");
                String ck = sc.next();
                if(ck.equals("네")) {
                    arithmeticCalculator.inquiryResults();
                }

            }

            // 원의 넓이
            else if(n == 2){
                System.out.print("반지름을 입력하세요 : ");
                int r = sc.nextInt();
                circleCalculator.CircleArea(r);

                System.out.print("데이터를 확인하시겠습니까? (네 / 아니오) ");
                String ck = sc.next();
                if(ck.equals("네")) {
                    circleCalculator.result();
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String st = sc.next();

            if(st.equals("exit")) flag = false;
        }
    }
}
