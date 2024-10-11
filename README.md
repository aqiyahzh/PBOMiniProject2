### OUTPUT PROGRAM


Dari kode awal hingga saat ini, berikut adalah beberapa perubahan yang ada:

Penambahan Kelas Abstrak dan Subclass:
Kelas Donasi diubah menjadi kelas abstrak untuk memungkinkan pembuatan subclass seperti RegularDonasi dan VIPDonasi.
Ini meningkatkan kemampuan untuk menerapkan inheritance dengan mendefinisikan tipe donasi yang berbeda.

Penerapan Getter dan Setter (Encapsulation):
Kelas Donasi kini memiliki getter dan setter untuk amount, memungkinkan akses terkontrol terhadap data.
Seperti: setAmount(double amount) dan getAmount() ditambahkan untuk mengatur dan mengambil jumlah donasi.

Implementasi Metode Abstrak:
Metode getDonasiType() ditambahkan sebagai metode abstrak dalam kelas Donasi, yang harus diimplementasikan dalam subclass untuk menentukan tipe donasi yang spesifik.

Perubahan Logika pada Metode CRUD:
Di dalam LayananDonasi, perubahan dibuat untuk memanfaatkan metode setter baru saat memperbarui jumlah donasi, memastikan bahwa jumlah donasi dapat diubah dengan benar.

Pengelolaan Donatur dan Donasi yang Lebih Baik:
Metode manageDonors dan manageDonations di kelas main ditambahkan untuk memisahkan logika pengelolaan donatur dan donasi, meningkatkan keterbacaan dan pemeliharaan kode.

Penggunaan Interface untuk CRUD:
Interface CRUD digunakan untuk mendefinisikan metode yang harus diimplementasikan, memberikan fleksibilitas dalam mengelola data.

Penambahan Pesan Konfirmasi dan Validasi:
Program memberikan lebih banyak umpan balik kepada pengguna melalui pesan konfirmasi dan penanganan kesalahan, misalnya, ketika donasi tidak ditemukan.
