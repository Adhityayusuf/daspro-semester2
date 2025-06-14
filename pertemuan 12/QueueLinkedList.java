public class QueueLinkedList {
    NodeQLL head;
    int capacity;
    int slot;

    public QueueLinkedList(int capacity) {
        this.capacity = capacity;
        this.slot = capacity;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return slot == 0;
    }

    public void clearQueue() {
        head = null;
        slot = capacity;
        System.out.println("Antrian dikosongkan.");
    }

    public void print() {
        if (!isEmpty()) {
            NodeQLL tmp = head;
            System.out.println("Isi antrian:");
            while (tmp != null) {
                tmp.data.tampil();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void addQueue(MahasiswaQueue input) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambahkan.");
            return;
        }

        NodeQLL newNode = new NodeQLL(input);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodeQLL tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        slot--;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public MahasiswaQueue getQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            NodeQLL temp = head;
            head = head.next;
            slot++;
            return temp.data;
        }
    }

    public int countMhs() {
        return capacity - slot;
    }

    public MahasiswaQueue firstQueue() {
        if (!isEmpty()) {
            return head.data;
        } else {
            return null;
        }
    }

    public MahasiswaQueue lastQueue() {
        if (!isEmpty()) {
            NodeQLL tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            return tmp.data;
        } else {
            return null;
        }
    }
}
