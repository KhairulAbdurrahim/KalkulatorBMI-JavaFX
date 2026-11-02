# Kalkulator BMI - JavaFX (MVC Pattern)

Aplikasi desktop Kalkulator *Body Mass Index* (BMI) berbasis Java yang dibangun menggunakan arsitektur **Model-View-Controller (MVC)**, framework **JavaFX**, tata letak **FXML**, dan manajemen *build* menggunakan **Maven**.

---

## Fitur Utama
* **Arsitektur MVC:** Pemisahan yang jelas antara logika perhitungan (`Model`), antarmuka pengguna (`View`/FXML), dan pengendali aktivitas tombol (`Controller`).
* **Desain Antarmuka Modern:** Tampilan antarmuka yang bersih dan interaktif menggunakan styling CSS JavaFX.
* **Validasi Input:** Dilengkapi penanganan error untuk mencegah nilai input kosong, nol, negatif, atau format angka yang tidak valid.
* **Perhitungan Akurat:** Menghitung indeks massa tubuh dengan presisi desimal dan mengelompokkannya ke dalam kategori berat badan standar.

---

## Dokumentasi Tampilan Aplikasi

Berikut adalah beberapa pratinjau tampilan dari aplikasi Kalkulator BMI:

### 1. Tampilan Awal Aplikasi
![Tampilan Awal](Tampilan%20Screenshot/Tampilan%20Awal.png)

### 2. Tampilan Hasil Perhitungan Berhasil
![Tampilan Berhasil](Tampilan%20Screenshot/Tampilan%20Berhasil.png)

### 3. Pengujian Validasi & Exception
* **Peringatan 1:**
  ![Exception 1](Tampilan%20Screenshot/Tampilan%20Exception%201.png)
* **Peringatan 2:**
  ![Exception 2](Tampilan%20Screenshot/Tampilan%20Exception%202.png)
* **Peringatan 3:**
  ![Exception 3](Tampilan%20Screenshot/Tampilan%20Exception%203.png)
* **Peringatan 4:**
  ![Exception 4](Tampilan%20Screenshot/Tampilan%20Exception%204.png)

---

## Teknologi & Tools
* **Java:** JDK 25 (Default)
* **JavaFX:** Versi 21.0.9
* **Build Tool:** Maven
* **IDE:** NetBeans IDE
* **Git & GitHub**

---

## Cara Menjalankan Aplikasi

### Melalui NetBeans IDE
1. Pastikan Anda sudah mengunduh/meng-clone repository ini ke komputer lokal.
2. Buka **NetBeans IDE**, lalu pilih **File > Open Project**.
3. Cari dan pilih folder project `KalkulatorBMI` tempat file `pom.xml` berada, lalu klik **Open Project**.
4. Tunggu beberapa saat hingga NetBeans selesai memuat seluruh *Dependencies* Maven.
5. Klik kanan pada nama project, lalu pilih **Run** (atau tekan tombol `F6`). Aplikasi JavaFX akan terbuka secara otomatis.
