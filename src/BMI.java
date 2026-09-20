import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg) : ");
        double berat = sc.nextDouble();
        System.out.print("Masukkan tinggi badan (cm) : ");
        double tinggi = sc.nextDouble();

        tinggi = tinggi / 100;

        double bmi = berat / (tinggi * tinggi);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("kategori: kurus");
        } else if (bmi < 25) {
            System.out.println("kategori: normal");
        } else if (bmi < 30) {
            System.out.println("kategori: gemuk");
        } else {
            System.out.println("kategori: obesitas");
        }
    }
}
