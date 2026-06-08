package warmup5;

public class MathHelper {

    //kiểm tra số chẵn
    public static boolean isEven(int n){
        return n % 2== 0;
    }

    //tìm số lớn nhất
    public static int maxOfThree(int a, int b, int c){
        int max = a;

        if(b > max){
            max = b;
        }

        if(c > max){
            max = c;
        }

        return max;
    }

    //tính diện tích hình tròn. Nếu bán kính âm -> trả về 0
    public static double circleArea(double radius){
        if(radius < 0){
            return 0.0;
        }
        return Math.PI * radius * radius;
    }
}
