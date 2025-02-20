public class fungsi13 {
    static int HARGA_AGLONEMA = 75000;
    static int HARGA_KELADI = 50000;
    static int HARGA_ALOCASIA = 60000;
    static int HARGA_MAWAR = 10000;
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        tampilkanPendapatan(stock);
        tampilkanStockRoyalGarden4(stock);
    }
    public static void tampilkanPendapatan(int[][] stock) {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = (stock[i][0] * HARGA_AGLONEMA) +
                             (stock[i][1] * HARGA_KELADI) +
                             (stock[i][2] * HARGA_ALOCASIA) +
                             (stock[i][3] * HARGA_MAWAR);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }
    public static void tampilkanStockRoyalGarden4(int[][] stock) {
        int[] stockRoyalGarden4 = stock[3];
        System.out.println("\nStock bunga pada cabang RoyalGarden 4 : ");
        System.out.println("Aglonema: " + (stockRoyalGarden4[0]-1));
        System.out.println("Keladi: " + (stockRoyalGarden4[1]-2));
        System.out.println("Alocasia: " + (stockRoyalGarden4[2]-0));
        System.out.println("Mawar: " + (stockRoyalGarden4[3]-5));
        System.out.println("KET : Aglonema -1, keladi -2, Alocasia -0, Mawar -5");
    }
} 