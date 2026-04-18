# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

## Posttest 5

**Oleh:**  
Ridwan Nur Rahman  
2409106064

---

# Penjelasan Singkat

Program ini merupakan pengembangan dari sistem manajemen toko alat elektronik sederhana menggunakan bahasa pemrograman Java dengan menerapkan konsep **Pemrograman Berbasis Objek (Object Oriented Programming / OOP)**.

Di dalam program terdapat empat class yang merepresentasikan jenis produk yaitu **Laptop, TV, Kulkas, dan AC**. Setiap class memiliki atribut seperti ID, merk, seri, serta spesifikasi tambahan sesuai jenis produknya.

Program ini telah menerapkan beberapa konsep utama dalam OOP, yaitu **Encapsulation, Inheritance, Polymorphism, Abstraction, dan Interface**.

Konsep **Encapsulation** diterapkan dengan membuat atribut bersifat **private** dan menggunakan method **getter dan setter** untuk mengakses serta memodifikasi data dengan validasi.

Konsep **Inheritance** diterapkan dengan menggunakan superclass **ProdukElektronik** yang mewariskan atribut umum ke subclass seperti Laptop, TV, Kulkas, dan AC.

Konsep **Polymorphism** diterapkan melalui method **tampilInfo()** yang dioverride pada setiap subclass sehingga setiap objek dapat menampilkan informasi sesuai jenisnya.

Konsep **Abstraction** diterapkan dengan menjadikan class **ProdukElektronik** sebagai **abstract class** dan mendefinisikan method abstract:

`tampilInfo()`

Sehingga class turunan wajib mengimplementasikan method tersebut sesuai dengan jenis produknya.

Konsep **Interface** diterapkan dengan membuat interface **Elektronik** yang memiliki method:

- `nyalakan()`
- `matikan()`

Seluruh class produk mengimplementasikan interface tersebut sehingga setiap objek memiliki perilaku yang sama.

---

# Fitur dan Fungsi Program

### 1. Menu Utama

Program menyediakan menu:

- Lihat Produk
- Tambah Produk
- Update Produk
- Hapus Produk
- Keluar

---

### 2. Create (Tambah Data)

Pengguna dapat menambahkan data produk baru dengan mengisi:

- ID
- Merk
- Seri
- Spesifikasi tambahan sesuai jenis produk

---

### 3. Read (Lihat Data)

Menampilkan data produk yang telah tersimpan menggunakan method:

`tampilInfo()`

Method ini merupakan hasil penerapan **abstraction** dan **polymorphism**.

---

### 4. Update (Ubah Data)

Mengubah data produk berdasarkan ID yang dimasukkan pengguna.

---

### 5. Delete (Hapus Data)

Menghapus data produk dari sistem berdasarkan ID.

---

### 6. Validasi Data

Program melakukan validasi input seperti:

- ID tidak boleh kosong
- Merk tidak boleh kosong
- Seri tidak boleh kosong
- Nilai numerik tidak boleh nol atau negatif

---

# Kesimpulan

Program ini merupakan implementasi lanjutan dari sistem CRUD menggunakan bahasa Java dengan pendekatan **Pemrograman Berbasis Objek (OOP)**.

Program ini berhasil menerapkan konsep:

- **Encapsulation** untuk menjaga keamanan data
- **Inheritance** untuk mengurangi duplikasi kode
- **Polymorphism** untuk fleksibilitas method
- **Abstraction** untuk menyederhanakan struktur program
- **Interface** untuk menyamakan perilaku antar class

Dengan penerapan konsep tersebut, program menjadi lebih terstruktur, mudah dikembangkan, dan sesuai dengan prinsip dasar OOP.