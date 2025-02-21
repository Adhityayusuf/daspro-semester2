public class MataKuliahMain13 {
    public static void main(String[] args) {
        MataKuliah13 mk1 = new MataKuliah13();
        mk1.nama = "Dasar pemrograman";
        mk1.kodeMk = "dsp";
        mk1.sks = 4;
        mk1.jumlahJam = 5;

        mk1.tampilkanInformasi();
        mk1.ubahSks(6);
        mk1.tambahJam(3);
        mk1.kurangiJam(4);
        mk1.tampilkanInformasi();

        MataKuliah13 mk2 = new MataKuliah13("ctps", "ps" , 5,6);
        mk2.tampilkanInformasi();
    }
}