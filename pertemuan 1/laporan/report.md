|  | Algorithm and Data Structure |
|--|--|
| NIM |   244107010045|
| Nama |  M.Adhitya Yusuf Al-Ayyubi |
| Kelas | TI - 1H |
| Repository | (https://github.com/Adhityayusuf/daspro-semester2/tree75a2698343655696b9ca9c3a355cb416e075ecd9/pertemuan%201) |

# PERTEMUAN KE SATU

## 1. PEMILIHAN 

The solution is implemented in Pemilihan13.java, and below is screenshot of the result.

![gambar](../gambar/image1.png)

**Alur Jalannya Program :**  
Berikut adalah alur singkat program:

1. **Tampilkan Judul**: Menampilkan teks **"Program Menghitung Nilai Akhir"**.
2. **Input Nilai**: Pengguna memasukkan nilai Tugas, Kuis, UTS, dan UAS.
3. **Validasi Nilai**: Jika nilai di luar rentang 0-100, tampilkan **"nilai tidak valid"** dan program berhenti.
4. **Hitung Nilai Akhir**
5. **Tentukan Nilai Huruf**: Berdasarkan nilai akhir, tentukan huruf (A, B+, B, C+, C, D, E).
6. **Tentukan Kelulusan**:  
   - **Lulus** jika huruf: A, B+, B, C+, C.  
   - **Tidak Lulus** jika huruf: D, E.
7. **Tampilkan Hasil**: Cetak nilai akhir, nilai huruf, dan status kelulusan.  

## 2. PERULANGAN

The solution is implemented in Perulangan13.java, and below is screenshot of the result.

![gambar](../gambar/image2.png)

**Alur Jalannya Program :**  
Berikut alur singkat program :

1. **Input NIM**: Pengguna memasukkan NIM sebagai **String**.
2. **Ambil Dua Digit Terakhir**: Ekstraksi dua angka terakhir dari NIM dan simpan dalam variabel **`n`**.
3. **Penyesuaian Nilai n**: Jika **`n < 10`**, tambahkan 10 ke nilai **`n`**.
4. **Cetak Nilai n**: Menampilkan nilai **`n`** yang telah disesuaikan.
5. **Perulangan Hingga n**:
   - Jika **`i == 6`** atau **`i == 10`**, lewati iterasi.
   - Jika **`i`** genap, cetak angka **`i`**.
   - Jika **`i`** ganjil, cetak simbol `*`.

## 3. Array  

The solution is implemented in Array13.java, and below is screenshot of the result.    

![gambar](../gambar/image3.png)   

**Alur Jalannya Program :**  
Berikut adalah alur singkat program :

1. **Tampilkan Judul**: Menampilkan **"PROGRAM MENGHITUNG IPK SEMESTER"**.
2. **Input Jumlah Mata Kuliah**: Pengguna memasukkan jumlah mata kuliah.
3. **Deklarasi Array**: Membuat array untuk menyimpan nama mata kuliah, bobot SKS, nilai angka, nilai setara, dan nilai huruf.
4. **Input Data Mata Kuliah**: Untuk setiap mata kuliah, pengguna memasukkan:
   - Nama mata kuliah
   - Bobot SKS
   - Nilai angka
5. **Konversi Nilai Angka ke Huruf dan Setara**:
   - Menentukan nilai huruf dan bobot nilai berdasarkan nilai angka.
6. **Hitung Total SKS dan Total Bobot Nilai**: Mengalikan nilai setara dengan bobot SKS dan menghitung total SKS.
7. **Tampilkan Data Mata Kuliah**: Menampilkan nama mata kuliah, nilai angka, nilai huruf, dan nilai setara.
8. **Hitung dan Cetak IPK Semester**.
