package warmup5;

public class WarmUp5 {
    public static void main(String[] args){
        //Test hàm isEven
        System.out.println("===== Kiểm tra số chẵn =====");
        System.out.println("4 là số chẵn? " + MathHelper.isEven(4));
        System.out.println("7 là số chẵn? " + MathHelper.isEven(7));
        System.out.println("-2 là số chẵn? " + MathHelper.isEven(-2));

        //Test hàm maxOfThree
        System.out.println("\n");
        System.out.println("===== Tìm số lớn nhất =====");
        System.out.println("Max của (5, 9, 2) là: " + MathHelper.maxOfThree(5,7,9));
        System.out.println("Max của (-1, -5, -3) là: " + MathHelper.maxOfThree(-1,-5,-3));
        System.out.println("Max của (9, 9, 9) là: " + MathHelper.maxOfThree(9,9,9));

        //Test hàm circleArea
        System.out.println("\n");
        System.out.println("===== Tính diện tích hình tròn =====");
        System.out.println("Bán kính 2.5: " + MathHelper.circleArea(2.5));
        System.out.println("Bán kính 0: " + MathHelper.circleArea(0));
        System.out.println("Bán kính -3: " + MathHelper.circleArea(-3));
    }
}
