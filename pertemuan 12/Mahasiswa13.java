public class Mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa13() {
    }

    public Mahasiswa13(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInfformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("------------------------");
    }
}