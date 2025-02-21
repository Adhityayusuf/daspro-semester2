public class Mahasiswa13 {
    String nama;
    String nim;
    String kelas;
    double ipk;
    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.println("Ipk  : " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "kinerja Kurang";
        }
    }
    public Mahasiswa13() {
    }
    public Mahasiswa13(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}