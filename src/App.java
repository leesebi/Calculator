import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans [] = new int[10];

        for(int i=0; i<10; i++){
            System.out.print("첫 번째 숫자를 입력하세요 :");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 :");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 :");
            char op = sc.next().charAt(0);

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
                    if(num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                        i--;
                        break;
                    }
                    result = num1 / num2;
                }
            }
            ans[i] = result;
            System.out.println("결과 : " + result);
        }

    }
}
