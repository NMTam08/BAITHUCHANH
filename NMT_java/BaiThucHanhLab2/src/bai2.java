import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("nhap vao so can kiem tra n:");
            n = scanner.nextInt();
        }
        // thực hiện câu lệnh if else để kiểm tra điều kiện
        if (n % 2 == 0) {
            System.out.println(n + " la so chan ");
        } else {
            System.out.println(n + " la so le ");
        }
    }
}