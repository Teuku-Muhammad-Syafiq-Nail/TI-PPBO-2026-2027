import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double TARIF_450 = 500;
        final double TARIF_900 = 750;
        final double TARIF_1300 = 1000;
        final double TARIF_2200 = 1500;
        final double TARIF_DIATAS_2200 = 2000;

        System.out.print("Masukkan golongan daya (VA): ");
        int daya = sc.nextInt();

        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kwh = sc.nextDouble();

        if (kwh <= 0) {
            System.out.println("Error: Pemakaian kWh harus lebih dari 0.");
        } else {
            double tarif;
            String golongan;

            if (daya == 450) {
                golongan = "450 VA";
                tarif = TARIF_450;
            } else if (daya == 900) {
                golongan = "900 VA";
                tarif = TARIF_900;
            } else if (daya == 1300) {
                golongan = "1300 VA";
                tarif = TARIF_1300;
            } else if (daya == 2200) {
                golongan = "2200 VA";
                tarif = TARIF_2200;
            } else if (daya > 2200) {
                golongan = "Di atas 2200 VA";
                tarif = TARIF_DIATAS_2200;
            } else {
                System.out.println("Error: Golongan daya tidak valid.");
                return;
            }

            double total = kwh * tarif;

            System.out.println("\n=== TAGIHAN LISTRIK ===");
            System.out.println("Golongan daya : " + golongan);
            System.out.println("Pemakaian     : " + kwh + " kWh");
            System.out.println("Tarif per kWh : Rp" + tarif);
            System.out.println("Total tagihan : Rp" + total);
        }
    }
}
