public class LogikaDemo {
    public static void main(String[] args) {
        int nilaiUjian = 80;
        int Kehadiran = 90;

        if (nilaiUjian >= 75 && Kehadiran >= 80) {
            System.out.println("LULUS mata Kuliah");
        } else {
            System.out.println("TIDAK LULUS mata Kuliah");
        }

        boolean punyaKTP = false;
        boolean punyaSIM = true;

        if (punyaKTP || punyaSIM) {
            System.out.println("Boleh menyewa kendaraan");
        }

        if (!punyaKTP) {
            System.out.println("KTP belum tersedia");
        }
    }
}
