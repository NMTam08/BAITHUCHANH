import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner
        System.out.print("nhap vao mot so nguyen 1 - 12: "); // In ra yêu cầu nhập
        int n = sc.nextInt(); // Đọc số nguyên từ bàn phím và gán cho biến n
        switch (n) { // Kiểm tra giá trị của n
            case 1: // Nếu n là 1
                System.out.println("thang 1"); // In ra "Tháng 1"
                break; // Thoát khỏi switch-case
            case 2: // Nếu n là 2
                System.out.println("thang 2"); // In ra "Tháng 2"
                break; 
            case 3: 
                System.out.println("thang 3");
                break;
            case 4:
                System.out.println("thang 4");
                break;
            case 5:
                System.out.println("thang 5");
                break;
            case 6:
                System.out.println("thang 6");
                break;
            case 7:
                System.out.println("thang 7");
                break;
            case 8:
                System.out.println("thang 8");
                break;
            case 9:
                System.out.println("thang 9");
                break;
            case 10:
                System.out.println("thang 10");
                break;
            case 11:
                System.out.println("thang 11");
               break;
            case 12:
               System.out.println ("thang 12 ");
               break ;
           default : // Nếu n không thuộc khoả ng từ1-12 
               System.out.println (" so khong hop le "); // In ra " Số không hợ p lệ "
       }
   }
}