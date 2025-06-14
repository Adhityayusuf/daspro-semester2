public class SLLMain13 {
    public static void main(String[] args) {
        SingleLinkedList13 sll = new SingleLinkedList13();

        Mahasiswa13 mhs1 = new Mahasiswa13("221", "Andi", "TI-4A", 3.8);
        Mahasiswa13 mhs2 = new Mahasiswa13("222", "Budi", "TI-4B", 3.5);
        Mahasiswa13 mhs3 = new Mahasiswa13("223", "Citra", "TI-4A", 3.7);
        Mahasiswa13 mhs4 = new Mahasiswa13("224", "Dina", "TI-4B", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dina", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Dina berada pada index : " + sll.indexOf("Dina"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}