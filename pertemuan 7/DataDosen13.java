public class DataDosen13 {
    Dosen13[] dataDosen = new Dosen13[10];
    int idx = 0;
    int jmlHasil;

    void tambah(Dosen13 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen13 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen13 temp = dataDosen[maxIndex];
            dataDosen[maxIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen13 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    int pencarianDataSequential13 (String nama) {
        jmlHasil = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                jmlHasil++;
                return i;
            }
        }
        return -1;
    }

    int pencarianDataBinary13 (int cari, int left, int right) {
        jmlHasil = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].usia == cari) {
                jmlHasil++;
            }
        }
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (dataDosen[mid].usia == cari) {
                return mid;
            } else if (dataDosen[mid].usia > cari) {
                return pencarianDataBinary13 (cari, left, mid - 1);
            } else {
                return pencarianDataBinary13 (cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Dosen dengan nama " + nama + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }

    void tampilPosisi(int usia, int pos) {
        if (pos != -1) {
            System.out.println("Dosen dengan usia " + usia + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        }
    }

    void tampilDataSearch(String nama, int pos) {
        if (pos != -1) {
            dataDosen[pos].tampil();
            if (jmlHasil > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
            }
        } else {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }

    void tampilDataSearch(int usia, int pos) {
        if (pos != -1) {
            dataDosen[pos].tampil();
            if (jmlHasil > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
            }
        } else {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan.");
        }
    }
}