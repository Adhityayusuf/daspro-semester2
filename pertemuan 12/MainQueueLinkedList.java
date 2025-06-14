import java.util.Scanner;

public class MainQueueLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimal antrian: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        QueueLinkedList queue = new QueueLinkedList(kapasitas);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Cek Antrian Penuh");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Tampilkan Jumlah Mahasiswa dalam Antrian");
            System.out.println("9. Tampilkan Seluruh Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Antrian penuh. Tidak dapat menambahkan.");
                    } else {
                        System.out.print("Masukkan NIM   : ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama  : ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Prodi : ");
                        String prodi = sc.nextLine();
                        MahasiswaQueue mhs = new MahasiswaQueue(nim, nama, prodi);
                        queue.addQueue(mhs);
                    }
                    break;

                case 2:
                    MahasiswaQueue panggil = queue.getQueue();
                    if (panggil != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        panggil.tampil();
                    }
                    break;

                case 3:
                    MahasiswaQueue depan = queue.firstQueue();
                    if (depan != null) {
                        System.out.println("Mahasiswa paling depan:");
                        depan.tampil();
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 4:
                    MahasiswaQueue akhir = queue.lastQueue();
                    if (akhir != null) {
                        System.out.println("Mahasiswa paling akhir:");
                        akhir.tampil();
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 5:
                    System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;

                case 6:
                    System.out.println(queue.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;

                case 7:
                    queue.clearQueue();
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa yang masih mengantre: " + queue.countMhs());
                    break;

                case 9:
                    queue.print();
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}