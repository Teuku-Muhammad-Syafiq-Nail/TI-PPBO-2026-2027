import  java.util.Scanner;

public class MembacaUmurStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan umur : ");
        int umur = sc.nextInt();

        System.out.print("apakah mahasiswa? (true/false) : ");
        boolean mahasiswa = sc.nextBoolean();

        if (mahasiswa || umur < 25) {
            System.out.println("mendapat harga khusus/diskon");
        } else {
            System.out.println("harga normal");
        }
    }
}
