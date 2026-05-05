import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();

        // Data mahasiswa via konstruktor
        Mahasiswa14 mhs1 = new Mahasiswa14("210001", "Dirga", "Sistem Informasi", "SI-1");
        Mahasiswa14 mhs2 = new Mahasiswa14("210002", "Bimon", "Sistem Informasi", "SI-1");
        Mahasiswa14 mhs3 = new Mahasiswa14("210003", "Rizky", "Sistem Informasi", "SI-1");
        Mahasiswa14 mhs4 = new Mahasiswa14("210004", "Dina", "Sistem Informasi", "SI-1");
        // ========== PRAKTIKUM 2.1 ==========
        sll.print();                        // Linked list kosong

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        // ========== PRAKTIKUM 2.2 ==========
        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println();

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();

        // ========== MODIFIKASI: Input dari Keyboard (Pertanyaan 2.1 no.3) ==========
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tambah Data dari Keyboard ===");
        System.out.print("NIM    : "); String nim   = sc.nextLine();
        System.out.print("Nama   : "); String nama  = sc.nextLine();
        System.out.print("Prodi  : "); String prodi = sc.nextLine();
        System.out.print("Kelas  : "); String kelas = sc.nextLine();

        Mahasiswa14 mhsBaru = new Mahasiswa14(nim, nama, prodi, kelas);
        sll.addLast(mhsBaru);
        sll.print();
        sc.close();
    }
}