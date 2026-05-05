**Pertanyaan 2.1**
1. Mengapa baris pertama "Linked List Kosong"?
Karena sll.print() dipanggil sebelum data apapun ditambahkan, sehingga head == null → masuk blok else yang mencetak "Linked list kosong".

2. Kegunaan variabel temp?
temp adalah pointer sementara untuk melakukan traversal (penelusuran) node-per-node tanpa menggeser head atau tail, sehingga struktur linked list tidak rusak.

3. Modifikasi input dari keyboard?
Sudah ada pada SLLMain14.

**Pertanyaan 2.2**
1. Mengapa digunakan break pada fungsi remove?
Karena setelah node yang cocok ditemukan dan dihapus, penelusuran harus dihentikan agar tidak berlanjut ke node berikutnya yang bisa menyebabkan error (NullPointerException) atau penghapusan yang tidak diinginkan.

2. Kegunaan kode temp.next = temp.next.next; if (temp.next == null) { tail = temp; }?
Baris pertama "melompati" node yang dihapus dengan menghubungkan node sebelumnya langsung ke node dua langkah ke depan. Baris if mengecek apakah node yang dihapus adalah node terakhir — jika iya, tail diperbarui ke temp agar pointer tail tetap valid.