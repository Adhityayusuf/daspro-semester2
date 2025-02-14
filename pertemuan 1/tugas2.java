import java.util.Scanner;
public class tugas2 {
    static int fitur,sisi;
    public static void volume() {
        int volume = sisi * sisi * sisi;
        System.out.println("hasil : " + volume);
    }
    public static void luasPermukaan() {
        int luasPermukaan = 6 * sisi * sisi;
        System.out.println("hasil : " + luasPermukaan);
    }
    public static void Keliling() {
        int Keliling = 12 * sisi;
        System.out.println("hasil : " + Keliling);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Pilih perhitungan yang ingin dilakukan:");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Berhenti");
            System.out.print("Masukkan pilihan : ");
            fitur = input.nextInt();
            switch (fitur) {
                case 1:
                    System.out.println("=== VOLUME KUBUS ===");
                    System.out.print("Input sisi : ");
                    sisi = input.nextInt();
                    volume();
                    break;
                case 2:
                    System.out.println("=== LUAS PERMUKAAN ===");
                    System.out.print("Input sisi : ");
                    sisi = input.nextInt();
                    luasPermukaan();
                    break;
                case 3:
                    System.out.println("=== KELILING KUBUS ===");
                    System.out.print("input sisi : ");
                    sisi = input.nextInt();
                    Keliling();
                    break;
                case 4:
                    System.out.println("=== SELESAI ===");
                    break;
                default:
                    System.out.println("=== TIDAK ADA PILIHAN ===");
            }
        } while (fitur != 4);
    }
}
