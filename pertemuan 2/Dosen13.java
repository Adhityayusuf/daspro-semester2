public class Dosen13 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    void tampilInformasi() {
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Id Dosen        : " + idDosen);
        System.out.println("Status          : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }
    int hitungMasaKerja(int thnskrg) {
        if(statusAktif == true) {
            return thnskrg - tahunBergabung;
        }
        else {
            return 0;
        }
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
    public Dosen13() {
    }
    public Dosen13(String nm, String id, boolean status, int tahun, String bidang){
        nama = nm;
        idDosen = id;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = bidang;
    }
}
