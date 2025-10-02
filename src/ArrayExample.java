import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int max = 0;
        double sum = 0.0;
        System.out.println("5개의 정수를 입력하세요.");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
        System.out.println("평균은 " + (sum / arr.length) + "입니다.");
        scanner.close();
    }
    
}
