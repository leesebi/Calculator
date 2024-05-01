import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InputException {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        while (flag) {
            System.out.print("1: 사칙연산 2: 원의 넓이 ");
            int n = sc.nextInt();

            // 사칙연산
            if (n == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                double result = arithmeticCalculator.calculate(num1, num2, operator);
                arithmeticCalculator.getResults().add(result);

                // 값 삭제
                System.out.print("제일 오래된 데이터를 삭제하시겠습니까? (네 / 아니오) ");
                String re = sc.next();
                if (re.equals("네")) {
                    arithmeticCalculator.removeResult(0);
                }

                // 데이터 값 확인
                System.out.print("데이터를 확인하시겠습니까? (네 / 아니오) ");
                String ck = sc.next();
                if (ck.equals("네")) {
                    arithmeticCalculator.inquiryResults();
                }
            } else if (n == 2) {
                System.out.print("반지름을 입력하세요 : ");
                int r = sc.nextInt();
                double area = circleCalculator.calculate(r);
                circleCalculator.getResults().add(area);

                System.out.print("데이터를 확인하시겠습니까? (네 / 아니오) ");
                String ck = sc.next();
                if (ck.equals("네")) {
                    circleCalculator.inquiryResults();
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String st = sc.next();

            if (st.equals("exit")) flag = false;
        }
    }
}
