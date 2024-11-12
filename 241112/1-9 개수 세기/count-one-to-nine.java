import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0, i, j;

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 1; i < 10; i++) {
            cnt = 0;
            for (j = 0; j < n; j++) {
                if (i == arr[j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}