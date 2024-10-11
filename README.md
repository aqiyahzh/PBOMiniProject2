*Data Diri*
_Nama  : Aqiyah Zulqiyah_
_NIM   : 2309116075_

### ⭐️ Perubahan Program
Perubahan yang dilakukan dengan menerapkan Inheritance, Encapsulation (getter dan setter), Abstraction, Interface, dan Final keyword

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

### ⭐️ Output Program

- Menambah Donatur
![Screenshot 2024-10-11 180510](https://github.com/user-attachments/assets/87896c07-aafc-428a-8398-a13027f6e3dc)

Program akan menampilkan menu untuk mengelola donatur. Pengguna memilih untuk menambah donatur.
Pengguna diminta untuk memasukkan tipe donatur (Regular atau VIP).
Program meminta nama dan email donatur yang baru.
Setelah memasukkan informasi, program akan mengkonfirmasi bahwa donatur baru telah ditambahkan.

- Melihat Daftar Donatur
![Screenshot 2024-10-11 180554](https://github.com/user-attachments/assets/ee331ec9-9e11-45d8-aad9-c80932efd09a)

Setelah menambah donatur, pengguna dapat memilih untuk melihat daftar donatur yang telah ditambahkan.

- Memperbaharui Data Donatur
![Screenshot 2024-10-11 183239](https://github.com/user-attachments/assets/0acdd5db-22d0-4e49-98ce-36179163a6b4)

Pengguna dapat memilih untuk memperbarui data donatur. Program akan meminta nama donatur yang ingin diperbarui, serta nama dan email baru.

- Menghapus Donatur
![Screenshot 2024-10-11 183304](https://github.com/user-attachments/assets/aca340ec-3cc1-43ff-824b-a612f86cdca7)

Pengguna dapat memilih untuk menghapus donatur berdasarkan nama.

- Menambah dan Mengelola Donasi
![Screenshot 2024-10-11 183340](https://github.com/user-attachments/assets/159e3dde-b9b4-42c5-b1fd-65affc1cfa1b)

![Screenshot 2024-10-11 183347](https://github.com/user-attachments/assets/42da6bfe-6441-4d85-819c-58a35330f1a3)

![Screenshot 2024-10-11 183417](https://github.com/user-attachments/assets/5cbcd1c8-b584-43d5-88d1-9cf4691869d9)

![Screenshot 2024-10-11 183435](https://github.com/user-attachments/assets/b4660a77-feb7-4be0-8aa3-4321ce01f919)

Program juga mengizinkan pengguna untuk menambah, memperbarui, melihat, dan menghapus donasi yang dilakukan oleh donatur. Pengguna akan diminta untuk memasukkan nama donatur dan jumlah donasi saat menambah donasi.
