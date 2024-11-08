import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        double avg = sum / n;
        System.out.printf("%.1f", avg);
        System.out.println();
        if (avg >= 4.0)
            System.out.print("Perfect");
        if (avg >= 3.0 && avg < 4.0)
            System.out.print("Good");
        if (avg < 3.0)
            System.out.print("Poor");
    }
}