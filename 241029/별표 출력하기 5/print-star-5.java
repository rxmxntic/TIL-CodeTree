import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                for(int k = 1; k <= i; k++)
                    System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}