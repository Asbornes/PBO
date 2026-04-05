# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

## Posttest 3

**Oleh:**
Ridwan Nur Rahman
2409106064

---

# Penjelasan Singkat

Program ini dibuat untuk mensimulasikan sistem manajemen toko alat elektronik sederhana menggunakan bahasa pemrograman Java dengan menerapkan konsep dasar **Pemrograman Berbasis Objek (Object Oriented Programming / OOP)**.

Di dalam program terdapat empat class yang merepresentasikan jenis barang yang dijual di toko, yaitu **Laptop, AC, TV, dan Kulkas**. Setiap class memiliki atribut yang menggambarkan informasi produk seperti ID, merk, seri, dan spesifikasi lainnya.

Program ini juga menerapkan konsep **Encapsulation**, yaitu teknik dalam OOP yang digunakan untuk membungkus data (atribut) dan method di dalam sebuah class serta membatasi akses langsung terhadap data tersebut. Atribut pada setiap class dibuat menggunakan access modifier **private**, sehingga tidak dapat diakses langsung dari luar class.

Selain itu, program ini juga mengimplementasikan konsep **Inheritance (Pewarisan)**. Atribut umum yang dimiliki setiap produk seperti ID, merk, dan seri disatukan ke dalam sebuah *superclass* bernama **ProdukElektronik**, yang kemudian diwariskan ke *subclass* (Laptop, AC, TV, dan Kulkas) untuk menghindari penulisan kode yang berulang.

Untuk mengakses dan mengubah nilai atribut tersebut digunakan **method Getter dan Setter** yang bersifat **public**. Method Getter digunakan untuk mengambil nilai atribut, sedangkan Setter digunakan untuk mengubah nilai atribut serta melakukan validasi terhadap data yang dimasukkan.

Saat program dijalankan, sistem akan menampilkan **menu utama** yang berisi beberapa pilihan fitur yang dapat digunakan oleh pengguna, yaitu melihat data produk, menambahkan produk baru, memperbarui data produk, menghapus produk, serta pilihan untuk keluar dari program.

Program akan terus berjalan menggunakan perulangan hingga pengguna memilih menu **keluar** dari program.

---

# Fitur dan Fungsi Program

### 1. Empat Class Produk

Program memiliki empat class utama yang digunakan untuk merepresentasikan produk yang dijual di toko, yaitu:

* Laptop
* TV
* Kulkas
* AC

Setiap class memiliki atribut yang berbeda sesuai dengan karakteristik produk.

---

### 2. Penerapan Encapsulation

Program ini menerapkan konsep **Encapsulation** dengan cara membuat atribut pada setiap class menggunakan access modifier **private** sehingga data tidak dapat diakses secara langsung dari luar class.

Sebagai gantinya, program menyediakan method **Getter dan Setter** yang digunakan untuk mengambil maupun mengubah nilai atribut. Dengan cara ini data menjadi lebih aman dan terkontrol.

---

### 3. Penerapan Inheritance (Pewarisan)

Program ini menerapkan konsep pewarisan dengan tipe **Hierarchical Inheritance**. Atribut dasar seperti ID, merk, dan seri dipusatkan pada sebuah *superclass* bernama **ProdukElektronik**. Class induk ini kemudian diwarisi secara bersamaan oleh empat *subclass* (**Laptop, TV, Kulkas, AC**), sehingga struktur kode menjadi jauh lebih efisien.

---

### 4. Method Getter dan Setter

Method **Getter** digunakan untuk mengambil nilai dari atribut yang bersifat private.


Method **Setter** digunakan untuk mengubah nilai atribut sekaligus melakukan validasi terhadap data yang dimasukkan oleh pengguna.

Dengan adanya setter, program dapat mencegah data yang tidak valid masuk ke dalam sistem.

---

### 5. Menu Utama Program

Menu utama berfungsi sebagai antarmuka awal bagi pengguna untuk memilih fitur yang tersedia dalam program.

---

### 6. Melihat Data Produk (Read)

Fitur ini digunakan untuk menampilkan daftar produk yang telah tersimpan di dalam sistem berdasarkan jenis produk yang dipilih.

---

### 7. Menambahkan Produk (Create)

Pengguna dapat menambahkan data produk baru ke dalam sistem dengan memasukkan informasi seperti ID produk, merk, seri, dan spesifikasi lainnya.

---

### 8. Mengubah Data Produk (Update)

Fitur ini memungkinkan pengguna untuk memperbarui informasi dari produk yang sudah ada dengan memasukkan ID produk yang ingin diubah.

---

### 9. Menghapus Produk (Delete)

Pengguna dapat menghapus data produk dari sistem berdasarkan ID produk yang dipilih.

---

### 10. Validasi ID Produk

Setiap produk memiliki **ID unik** yang tidak boleh sama dengan produk lainnya. Sistem akan melakukan pengecekan untuk memastikan tidak ada ID yang duplikat saat menambahkan produk baru.

---

# Kesimpulan

Program ini merupakan implementasi sederhana dari konsep **CRUD (Create, Read, Update, Delete)** menggunakan bahasa Java dengan pendekatan **Pemrograman Berbasis Objek (OOP)**.

Program ini menerapkan konsep **Inheritance** dengan tipe *Hierarchical Inheritance* (menggunakan *superclass* ProdukElektronik) untuk menghindari redudansi kode. Program ini juga menerapkan konsep **Encapsulation** dengan menggunakan access modifier **private** pada atribut serta menyediakan **method Getter dan Setter** untuk mengakses dan mengubah data. Hal ini membuat data menjadi lebih aman dan terkontrol.

Melalui program ini, pengguna dapat mengelola data produk elektronik secara sederhana melalui menu yang disediakan. Selain itu, program ini juga melatih pemahaman mengenai penggunaan **class, object, inheritance, encapsulation, getter dan setter, array list, perulangan, percabangan, serta validasi input** dalam pengembangan aplikasi berbasis objek.