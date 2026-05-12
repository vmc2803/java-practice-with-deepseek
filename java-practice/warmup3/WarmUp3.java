package warmup3;

import java.util.Scanner;

public class WarmUp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int res = n * i;
            System.out.println(n + " x " + i + " = " + res);
        }
        scanner.close();
    }
}
