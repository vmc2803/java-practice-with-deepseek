package warmup2;

import java.util.*;

public class WarmUp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // tạo máy đọc Scanner từ bàn phím
        System.out.println("nhập số n: ");
        int n = scanner.nextInt(); //khai báo biến n và nhập n từ bàn phím

        if (n < 0) {
            System.out.print("SO AM ");
        }

        if (n % 2 == 0){
            System.out.print("CHAN");
        }else{
            System.out.print("LE");
        }
    }
}
