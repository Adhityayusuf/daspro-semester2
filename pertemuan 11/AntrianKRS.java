public class AntrianKRS {
    Mahasiswa13[] data;
    int front, rear, size, max;
    int sudahDiproses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa13[max];
        front = 0;
        rear = -1;
        size = 0;
        sudahDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        sudahDiproses = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(Mahasiswa13 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian KRS.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
            return;
        }
        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa13 mhs = data[front];
            front = (front + 1) % max;
            size--;
            sudahDiproses++;
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar antrian KRS:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDepan() {
        if (size < 2) {
            System.out.println("Belum ada 2 antrian di depan.");
            return;
        }
        System.out.println("2 mahasiswa terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling belakang:");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahProses() {
        return sudahDiproses;
    }

    public int getBelumDiproses() {
        return 30 - sudahDiproses;
    }
}