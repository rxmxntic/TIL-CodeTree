import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
            cnt++;
        }
        sum = arr[cnt-1] + arr[cnt-2] + arr[cnt-3];
        System.out.print(sum);
    }
}