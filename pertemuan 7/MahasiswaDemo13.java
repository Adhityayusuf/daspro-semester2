import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa13 mhs = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        
        list.tampil();
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        // Melakukan pencarian data sequential
        System.out.println("------------------------------------------------------------");
        System.out.println("Menggunakan sequential searching");
        System.out.println("------------------------------------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // Melakukan pencarian data Binary
        System.out.println("------------------------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("------------------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}