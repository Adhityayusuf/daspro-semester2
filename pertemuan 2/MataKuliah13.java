public class MataKuliah13 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;
    void tampilkanInformasi() {
        System.out.println("Nama       : " + nama);
        System.out.println("kode MK    : " + kodeMk);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
    void ubahSks(int sksBaru) {
        sks = sksBaru;
        System.out.println("Sks Telah Diubah");
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan !!!");
        }
    }
    public MataKuliah13() {
    }
    public MataKuliah13(String nm, String mk, int sks, int jam) {
        nama = nm;
        kodeMk = mk;
        this.sks = sks;
        jumlahJam = jam;
    } 
}
