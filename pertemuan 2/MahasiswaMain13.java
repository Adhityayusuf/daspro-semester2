public class MahasiswaMain13 {
    public static void main(String[] args) {
        Mahasiswa13 mhsl = new Mahasiswa13();
        mhsl.nama = "Muhammmad Ali Farhan";
        mhsl.nim = "244107020045";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa27 mhs2 = new Mahasiswa27("Annisa Nabila","2141720160", 3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa27 mhs13 = new Mahasiswa27("M.Adhitya Yusuf Al-Ayyubi","244107020045", 3.72, "TI 1H");
        mhs13.tampilkanInformasi();
    }
}
