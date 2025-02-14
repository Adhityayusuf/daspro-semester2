import java.util.Scanner;
public class array13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("PROGRAM MENGHITUNG IPK SESMESTER");
        System.out.println("================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = input.nextInt();
        input.nextLine();
        String[] namaMataKuliah = new String[jumlahMataKuliah];
        int[] bobotSKS = new int[jumlahMataKuliah];
        double[] nilaiAngka = new double[jumlahMataKuliah];
        double[] nilaiSetara = new double[jumlahMataKuliah];
        String[] nilaiHuruf = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMataKuliah[i] = input.nextLine();
            System.out.print("Masukkan bobot SKS untuk " + namaMataKuliah[i] + ": ");
            bobotSKS[i] = input.nextInt();
            System.out.print("Masukkan nilai angka untuk " + namaMataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
            input.nextLine();

            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiSetara[i] = 4.0;
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] >= 73 && nilaiAngka[i] < 80) {
                nilaiSetara[i] = 3.5;
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] >= 65 && nilaiAngka[i] < 73) {
                nilaiSetara[i] = 3.0;
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiSetara[i] = 2.5;
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] >= 50 && nilaiAngka[i] < 60) {
                nilaiSetara[i] = 2.0;
                nilaiHuruf[i] = "C";
            } else if (nilaiAngka[i] >= 39 && nilaiAngka[i] < 50) {
                nilaiSetara[i] = 1.0;
                nilaiHuruf[i] = "D";
            } else {
                nilaiSetara[i] = 0.0;
                nilaiHuruf[i] = "E";
            }
        }

        double totalNilaiKaliSKS = 0;
        int totalSKS = 0;
        System.out.println("================================");
        System.out.println("Hasil Konversi Nilai:");
        System.out.println("================================");
        System.out.println("Mata Kuliah\t\tNilai Angka\tNilai Huruf\tBobot nilai");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalNilaiKaliSKS += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
            System.out.println(namaMataKuliah[i] +"\t\t\t"+ nilaiAngka[i] +"\t\t"+ nilaiHuruf[i] +"\t\t"+ nilaiSetara[i]);
        }
        double ipSemester = totalNilaiKaliSKS / totalSKS;
        System.out.println("================================");
        System.out.println("IP Semester: " + ipSemester);
        System.out.println("============ SELESAI ===========");
        input.close();
    }
}
