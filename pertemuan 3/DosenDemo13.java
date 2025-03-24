import java.util.Scanner;
public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = input.nextInt();
        input.nextLine();

        Dosen13[] daftarDosen = new Dosen13[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            String kode = input.nextLine();
            System.out.print("Nama           : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (Pria = true, Wanita = false) : ");
            Boolean jenisKelamin = input.nextBoolean();
            System.out.print("Usia           : ");
            int usia = input.nextInt();
            input.nextLine();

            daftarDosen[i] = new Dosen13(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------------");
        }

        System.out.println("\nMenampilkan Semua Data Dosen:");
        DataDosen13.dataSemuaDosen(daftarDosen);

        System.out.println("\nMenampilkan Jumlah Dosen Per Jenis Kelamin:");
        DataDosen13.jumlahDosenPerJenisKelamin(daftarDosen);

        System.out.println("\nMenampilkan Rata-rata Usia Dosen Per Jenis Kelamin:");
        DataDosen13.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        System.out.println("\nMenampilkan Dosen Paling Tua:");
        DataDosen13.infoDosenPalingTua(daftarDosen);

        System.out.println("\nMenampilkan Dosen Paling Muda:");
        DataDosen13.infoDosenPalingMuda(daftarDosen);

        input.close();
    }
}