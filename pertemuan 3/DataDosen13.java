public class DataDosen13 {
    public static void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        for (Dosen13 dosen : arrayOfDosen) {
            dosen.tampilkanData();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + (jumlahPria > 0 ? (totalUsiaPria / jumlahPria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (jumlahWanita > 0 ? (totalUsiaWanita / jumlahWanita) : 0));
    }

    public static void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen13 tertua = arrayOfDosen[0];

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanData();
    }

    public static void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen13 termuda = arrayOfDosen[0];

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanData();
    }
}

