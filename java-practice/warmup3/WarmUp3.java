package warmup3;

import java.util.Scanner;

public class WarmUp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n = scanner.nextInt();

        inThanhNgang();
        System.out.println("may tinh dang xu ly");
        inThanhNgang();
        System.out.println("ket qua la: ");
        inBangCuuChuongVoiWhile(n);

        scanner.close();
    }

    public static void inBangCuuChuongVoiWhile(int n) {
        int i = 1;
        while (i <= 10) {
            int res = n * i;
            System.out.println(n + " x " + i + " = " + res);
            i++;
        }
    }

    public static void inThanhNgang() {
        System.out.println("=========================================");
    }
}
