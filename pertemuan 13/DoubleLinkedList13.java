public class DoubleLinkedList13 {
    Node13 head;
    Node13 tail;

    public DoubleLinkedList13() {
        head = null;
        tail = null;
    }

    public boolean  isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa13 data) {
        Node13 newNode = new Node13(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa13 data) {
        Node13 newNode = new Node13(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa13 data) {
        Node13 current = head;
        
        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        
        Node13 newNode = new Node13(data);
        
        // Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            System.out.println("Isi linked list:");
            Node13 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public Node13 search(String nim) {
        Node13 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data yang dihapus:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data yang dihapus:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void add(Mahasiswa13 data, int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node13 temp = head;
        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }

        Node13 newNode = new Node13(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
        System.out.println("Data berhasil ditambahkan di indeks ke-" + index);
    }

    public void removeAfter(String keyNim) {
        Node13 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Tidak ditemukan data setelah NIM " + keyNim);
            return;
        }

        Node13 toDelete = current.next;
        System.out.println("Data setelah NIM " + keyNim + " yang dihapus:");
        toDelete.data.tampil();

        current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }

        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node13 temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }

        System.out.println("Data di indeks " + index + " yang dihapus:");
        temp.data.tampil();

        if (temp == tail) {
            removeLast();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public Mahasiswa13 getFirst() {
        return isEmpty() ? null : head.data;
    }

    public Mahasiswa13 getLast() {
        return isEmpty() ? null : tail.data;
    }

    public Mahasiswa13 getIndex(int index) {
        Node13 temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        return temp != null ? temp.data : null;
    }

    public int size() {
        int count = 0;
        Node13 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
