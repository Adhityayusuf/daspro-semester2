public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dsn1 = new Dosen13();
        dsn1.nama = "Herlambang wibowo";
        dsn1.idDosen = "266782568256";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2016;
        dsn1.bidangKeahlian = "dasar pemrogaman";
        dsn1.tampilInformasi();
        System.out.println("lama bekerja    : " + dsn1.hitungMasaKerja(2025));

        Dosen13 dsn2 = new Dosen13("adit", "242542425", false, 2006, "ctps");
        dsn2.tampilInformasi();
        System.out.println("lama bekerja    : " + dsn2.hitungMasaKerja(2025));
    }
}
