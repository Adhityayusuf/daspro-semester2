import java.util.Scanner;
public class Matakuliahdemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah13[] arrayOfMatakuliah13 = new Matakuliah13[3];

        int n;
        System.out.print("Jumlah MataKuliah : ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i+1));
            arrayOfMatakuliah13[i] = new Matakuliah13();
            arrayOfMatakuliah13[i].tambahData();
        }

        for(int i = 0; i < n; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            arrayOfMatakuliah13[i].cetakInfo();
        }
    }
}
