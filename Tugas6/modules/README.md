Data dan Analisis hasil percobaan 
    Pertanyaan 
1. Jalankan code program diatas dan benahi  jika menemukan kesalahan!
Tidak ada kesalahan

2. Bagaimana  cara  konstruktor  pada  subclass  memanggil  konstruktor  di  superclass  nya? 
Apakah hal itu perlu dilakukan? Sertakan alasan anda
menggunakan super(name, salary, year, month, day);
Jadi, ya, memanggil konstruktor superclass pada subclass itu perlu dilakukan untuk memastikan inisialisasi yang benar dan konsisten serta mencegah kesalahan yang mungkin terjadi.
apakah perlu? iya untuk melakukan inisialisasi yang sesuai pada level superclass
alasannya ? inisiasi yang diperlukan dari superclass dilakukan dengan benar, sehingga objek subclass dibuat dalam keadaan yang konsisten.

3. Tambahkan  constructor  pada  class  Employee  dengan  parameter  String  name!  amati 
perubahan apa yang terjadi, jelaskan jawaban anda! 
tidak terjadi apa apa
Dengan menambahkan konstruktor pertama dengan parameter String name, pengguna kelas Employee sekarang memiliki opsi untuk membuat objek Employee dengan hanya memberikan nama, tanpa harus menyediakan nilai gaji atau tanggal penggajian.

4. Pada  Class  Manager  baris  ke  5,  setelah  variable  day  tambahkan  variable  bonus!  Amati 
apa yang terjadi dan mengapa demikian
terjadi error karena tidak ada atributt yang membutuhkan nilai dari variabel setelah day dalam konstructor di superclass

5. Untuk apa digunakan keyword this pada class  manager dan employee? Hapus keyword 
this dan amati apa yang terjadi?
keyword this berguna untuk merujuk ke objek saat ini yang sedang dibuat. Ini berguna ketika memiliki variabel lokal yang memiliki nama yang sama dengan variabel instance dari kelas tersebut. 

6. Tambahkan  constructor  pada  class  Employee  dengan  parameter  Bertipe  data  string 
bernama  name  yang  nantinya  bila  constructor  ini  akan  dipanggil  akan  menginisialisasi 
variable  name!  Amati  perubahannya  pada  class  anak  dan  jelaskan!  Benahi  bila  terjadi 
kesalahan!
tidak terjadi kesalahan, Dengan menambahkan konstruktor baru dengan parameter String name, kelas Employee sekarang memiliki opsi untuk membuat objek Employee hanya dengan memberikan nama, tanpa harus menyediakan nilai gaji atau tanggal penggaji

7. Ubahlah acces modifier method pada kelas employee menjadi : 
a. Private 
b. Protected 
Amati perubahan apa yang terjadi? Jelaskan jawaban anda dengan detail! 

a. compile error karena method modifier private hanya dapat di akses di class itu sendiri dan tidak dapat di akses di subclass
b. compile tidak error, karena method modifier menjadi protected, method-method ini dapat diakses oleh kelas yang berada dalam paket yang sama atau oleh kelas turunan (subclass), bahkan jika kelas turunan berada di paket yang berbeda.