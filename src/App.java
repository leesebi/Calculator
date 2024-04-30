import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();

        boolean flag = true;
        while (flag){
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
                        break;
                    }
                    result = num1 / num2;
                }
            }
            ans.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String st = sc.next();

            if(st.equals("remove")){
                ans.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String in = sc.next();
            if(in.equals("inquiry")){
                for(int x:ans) System.out.print(x+" ");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if(exit.equals("exit")) flag = false;
        }

    }
}
