import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요.");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                scanner.next(); // 버퍼에 남아있는 잘못된 문자열을 제거
                i--; // 잘못된 입력에 대해 반복 횟수를 줄임
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum + "입니다.");
        scanner.close();
    }
    
}
