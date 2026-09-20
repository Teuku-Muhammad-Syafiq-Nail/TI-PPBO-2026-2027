import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu Makanan ===");
        System.out.println("sosis bakar");
        System.out.println("ayam geprek");
        System.out.println("kentang goreng");
        System.out.println("pisang goreng");

        System.out.print("pilih menu makanan(1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("anda memilih sosis bakar");
                break;
            case 2:
                System.out.println("anda memilih ayam geprek");
                break;
            case 3:
                System.out.println("anda memilih kentang goreng");
                break;
            case 4:
                System.out.println("anda memilih pisang goreng");
                break;
            default:
                System.out.println("pilihan tidak valid");
        }
    }
}
