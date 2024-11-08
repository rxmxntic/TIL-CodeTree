import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[4];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            double sum = 0;

            for (int j = 0; j < 4; j++) {
                arr[j] = sc.nextDouble();
                sum += arr[j]/4;
            }            
            if (sum >= 60) {
                System.out.println("pass");
                cnt++;
            }
            else {
                System.out.println("fail");
            }
        }
        System.out.print(cnt);
    }
}