import java.util.Scanner;

public class DosenMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen13 daftarDosen = new DataDosen13();

        int pilihan;
        do {
            System.out.println("\n===== MENU MANAJEMEN DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia muda ke tua) menggunakan Bubble Sort");
            System.out.println("4. Sorting DSC (Usia tua ke muda) menggunakan Selection Sort");
            System.out.println("5. Sorting DSC (Usia tua ke muda) menggunakan Insertion Sort");
            System.out.println("6. Cari Dosen berdasarkan Nama (Sequential Search)");
            System.out.println("7. Cari Dosen berdasarkan Usia (Binary Search)");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    String lanjut;
                    do{
                        System.out.print("Masukkan kode dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan nama dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan jenis kelamin (true = Laki-laki / false = Perempuan): ");
                        boolean jenisKelamin = sc.nextBoolean();
                        System.out.print("Masukkan usia dosen: ");
                        int usia = sc.nextInt();
                        sc.nextLine();

                        Dosen13 dsn = new Dosen13(kode, nama, jenisKelamin, usia);
                        daftarDosen.tambah(dsn);
                        System.out.println("Data dosen berhasil ditambahkan.");
                        System.out.print("Apakah ingin menambahkan data lagi? (y/n): ");
                        lanjut = sc.nextLine();
                    } while (lanjut.equalsIgnoreCase("y"));
                    break;

                case 2:
                    System.out.println("\n===== Data Dosen =====");
                    daftarDosen.tampil();
                    break;

                case 3:
                    daftarDosen.sortingASC();
                    System.out.println("Data setelah sorting ASC:");
                    daftarDosen.tampil();
                    break;

                case 4:
                    daftarDosen.sortingDSC();
                    System.out.println("Data setelah sorting DSC (Selection Sort):");
                    daftarDosen.tampil();
                    break;

                case 5:
                    daftarDosen.insertionSort();
                    System.out.println("Data setelah sorting DSC (Insertion Sort):");
                    daftarDosen.tampil();
                    break;

                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    int posisiNama = daftarDosen.pencarianDataSequential13(cariNama);
                    daftarDosen.tampilPosisi(cariNama, posisiNama);
                    daftarDosen.tampilDataSearch(cariNama, posisiNama);
                    break;
                
                case 7:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    daftarDosen.sortingASC();
                    int posisiUsia = daftarDosen.pencarianDataBinary13(cariUsia, 0, daftarDosen.idx - 1);
                    daftarDosen.tampilPosisi(cariUsia, posisiUsia);
                    daftarDosen.tampilDataSearch(cariUsia, posisiUsia);
                    break;

                case 8:
                    System.out.println("Keluar dari program !!!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 8);
        sc.close();
    }
}
