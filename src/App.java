import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws InputExcetpion{
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        Calculator calculator = new Calculator();
        while(flag){
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.println(calculator.calculate(num1,num2, operator));
            // 값 삭제
            System.out.print("제일 오래된 데이터를 삭제하시겠습니까? (네 / 아니오) ");
            String re = sc.next();
            if(re.equals("네")) {
                calculator.removeResult();
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String st = sc.next();

            if(st.equals("exit")) flag = false;
        }
    }
}
