public class MahasiswaQueue {
    String nim;
    String nama;
    String prodi;

    MahasiswaQueue(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampil() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("---------------------------");
    }
}