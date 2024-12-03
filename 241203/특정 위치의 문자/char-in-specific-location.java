import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] word = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};
        Scanner sc = new Scanner(System.in);

        int idx = -1;
        char a = sc.next().charAt(0);

        for (int i = 0; i < 6; i++) {
            if (word[i] == a) {
                idx = i;
            }
        }

        // 문자가 존재하지 않는 경우
        if (idx == -1) {
            System.out.println("None");
        }
        else {
            System.out.println(idx);
        }
    }
}