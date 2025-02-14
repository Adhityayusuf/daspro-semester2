import java.util.Scanner;
public class tugas3 {
    static Scanner input = new Scanner(System.in);
    static String[] namaMataKuliah;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;
    static int index;
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Matkul: ");
        index = input.nextInt();
        input.nextLine();
        namaMataKuliah = new String[index];
        sks = new int[index];
        semester = new int[index];
        hariKuliah = new String[index];
        for (int i = 0; i < index; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama mata kuliah: ");
            namaMataKuliah[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = input.nextLine();
        }
        int fitur;
        do {
            System.out.println("\nMenu Jadwal Kuliah:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            fitur = input.nextInt();
            input.nextLine();
            switch (fitur) {
                case 1:
                    System.out.println("=== SELURUH JADWAL KULIAH ===");
                    seluruhJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari yang diinginkan: ");
                    String hari = input.nextLine();
                    System.out.println("Jadwal Kuliah pada hari " + hari + ":");
                    System.out.printf("%-20s %-10s %-10s %-15s\n", "Nama Matkul", "Jumlah SKS", "Semester", "Nama Hari");
                    for (int i = 0; i < index; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            System.out.printf("%-20s %-10d %-10d %-15s\n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);

                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan semester yang diinginkan: ");
                    int semesterCari = input.nextInt();
                    System.out.println("Jadwal Kuliah pada semester " + semesterCari + ":");
                    System.out.printf("%-20s %-10s %-10s %-15s\n", "Nama Matkul", "Jumlah SKS", "Semester", "Nama Hari");
                    for (int i = 0; i < index; i++) {
                        if (semester[i] == semesterCari) {
                            System.out.printf("%-20s %-10d %-10d %-15s\n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaCari = input.nextLine();
                    System.out.println("\nHasil Pencarian Mata Kuliah \"" + namaCari + "\":");
                    boolean ditemukan = false;
                    System.out.printf("%-20s %-10s %-10s %-15s\n", "Nama Matkul", "Jumlah SKS", "Semester", "Nama Hari");
                    for (int i = 0; i < index; i++) {
                        if (namaMataKuliah[i].equalsIgnoreCase(namaCari)) {
                            System.out.printf("%-20s %-10d %-10d %-15s\n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mata kuliah \"" + namaCari + "\" tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("===== SELESAI =====");
                default:
                    System.out.println("===== FITUR TIDAK TERSEDIA =====");
            }
        } while (fitur != 5);
    }
    public static void seluruhJadwal() {
        System.out.printf("%-20s %-10s %-10s %-15s\n", "Nama Matkul", "Jumlah SKS", "Semester", "Nama Hari");
        for (int i = 0; i < index; i++) {
            System.out.printf("%-20s %-10d %-10d %-15s\n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
        }
    }
}