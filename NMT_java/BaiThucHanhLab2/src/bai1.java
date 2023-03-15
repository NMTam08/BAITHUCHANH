import java.text.DecimalFormat;
import java.util.Scanner; 
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("nhap vao so thu nhat : ");
        int A = scanner.nextInt();
        System.out.println("nhap vao so  hai: ");
        int B = scanner.nextInt();
        // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
        int tong = A + B ;
        System.out.println(A + " + " + B + " = " + tong);
        int hieu = A - B;
        System.out.println(A + " - " + B + " = " + hieu);
        int tich = A * B;
        System.out.println(A + " * " + B + " = " + tich);
        float thuong = (float) A / B;
        System.out.println(A + " / " + B + " = " + 
                decimalFormat.format(thuong));  
        // làm tròn thương đến 2 chữ số thập phân
        int phanDu = A % B;
        System.out.println(A + " % " + B + " = " + phanDu); 
        // 2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
        System.out.println("ket qua so sanh bang 2 so  " + A + " và " + 
                B + " là " + (A == B));
        System.out.println("ket qua so sanh khong bang 2 so  " + A + " và " + 
                B + " là " + (A != B));
        System.out.println("ket qua so sanh lon hon  " + A + " và " + 
                B + " là " + (A > B));
        System.out.println("ket qua so sanh lon hon hoac bang 2 so  " + A + " và " + 
                B + " là " + (A >= B));
        System.out.println("Ket qua so sanh sanh nho hon 2 so  " + A + " và " + 
                B + " là " + (A < B));
        System.out.println("Ket qua so so sanh nho hon hoac bang 2 so " + A + " và " + 
                B + " là " + (A <= B));
    }
 
}