public class KampusMain13 {
    public static void main(String[] args) {
        Kampus13[] kmp = {
            new Kampus13("Ahmad", "220101001", 2022, 78, 82),
            new Kampus13("Budi", "220101002", 2022, 85, 88),
            new Kampus13("Cindy", "220101003", 2021, 90, 87),
            new Kampus13("Dian", "220101004", 2020, 76, 79),
            new Kampus13("Eko", "220101005", 2023, 92, 95),
            new Kampus13("Fajar", "220101006", 2020, 88, 85),
            new Kampus13("Gina", "220101007", 2023, 80, 83),
            new Kampus13("Hadi", "220101008", 2020, 82, 84)
        };

        System.out.println("Data Mahasiswa : ");
        for (Kampus13 k : kmp) {
            k.tampilkanData();
        }
    }
}
