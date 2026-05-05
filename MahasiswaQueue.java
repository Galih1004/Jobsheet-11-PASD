public class MahasiswaQueue {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaQueue() {}

    public MahasiswaQueue(String nim, String nama, String kelas, double ipk) {
        this.nim   = nim;
        this.nama  = nama;
        this.kelas = kelas;
        this.ipk   = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s %-12s %-5s %.1f%n", nama, nim, kelas, ipk);
    }
}