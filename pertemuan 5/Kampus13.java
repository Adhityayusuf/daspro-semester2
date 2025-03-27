public class Kampus13 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUts;
    int nilaiUas;

    Kampus13(String name, String nm, int thnMasuk, int nliUts, int nliUas) {
        nama = name;
        nim = nm;
        tahunMasuk = thnMasuk;
        nilaiUts = nliUts;
        nilaiUas = nliUas;
    }

    void tampilkanData() {
        System.out.println(nama + " (" + nim + "), Tahun Masuk: " + tahunMasuk + ", UTS: " + nilaiUts + ", UAS: " + nilaiUas);
    }

    int cariUtsTertinggi(Kampus13[] kmp, int l, int r) {
        if (l == r) {
            return kmp[l].nilaiUts;
        }
        int mid = (l + r) / 2;
        int maxLeft = cariUtsTertinggi(kmp, l, mid);
        int maxRight = cariUtsTertinggi(kmp, mid + 1, r);
        return (maxLeft > maxRight) ? maxLeft : maxRight;
    }

    int cariUtsTerendah(Kampus13[] kmp, int l, int r) {
        if (l == r) {
            return kmp[l].nilaiUts;
        }
        int mid = (l + r) / 2;
        int minLeft = cariUtsTerendah(kmp, l, mid);
        int minRight = cariUtsTerendah(kmp, mid + 1, r);
        return (minLeft < minRight) ? minLeft : minRight;
    }

    double hitungRataRataUAS(Kampus13[] kmp) {
        double total = 0;
        for (Kampus13 k : kmp) {
            total += k.nilaiUas;
        }
        return total / kmp.length;
    }
}