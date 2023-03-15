import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        year = scanner.nextInt();
         
        age = 2023 - year;  // 2023 là năm hiện tại
        if (age < 16) {
            ageGroup = "vi thanh nien.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuoi truong thanh.";
        } else {
            ageGroup = "da gia";
        }
         
        System.out.println("Ban " + name + "Dang o do tuoi " + ageGroup);
    }

 
}

