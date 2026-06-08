package warmup4;

import java.util.*;

/*
Mục tiêu bài WarmUp4 – Máy tính cộng dồn
Cho phép người dùng nhập nhiều số nguyên liên tiếp.
Khi người dùng nhập số 0, chương trình dừng nhập.
In ra tổng và trung bình cộng của các số đã nhập (không tính số 0).
Phải xử lý trường hợp người dùng nhập ngay số 0 (không có số nào để tính trung bình).

Ví dụ:

text
Nhập số (0 để dừng): 5
Nhập số (0 để dừng): 10
Nhập số (0 để dừng): -3
Nhập số (0 để dừng): 0
Tổng = 12
Trung bình = 4.0

Gợi ý logic (từng bước)
Tạo Scanner.
Khai báo int sum = 0; int count = 0;
Vòng lặp vô hạn:
In "Nhập số (0 để dừng): ".
Đọc int num = scanner.nextInt();
Nếu num == 0 → break;
Cộng sum += num;
Tăng count++
Sau vòng lặp:
Nếu count == 0 → in "Không có số nào được nhập."
Ngược lại → in sum và (double) sum / count.
 */

public class WarmUp4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Nhập số (0 để dừng): ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
            count++;
        }

        if (count == 0) {
            System.out.println("Không có số nào được nhập.");
        } else {
            System.out.println("Tổng cộng là: " + sum);
            System.out.println("Trung bình cộng là: " + ((double) sum / count));
        }
        sc.close();
    }
}
