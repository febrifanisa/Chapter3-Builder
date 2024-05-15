Analisa AlatTulis.java:

1. AlatTulis
- Kelas ini menampilkan objek alat tulis dengan atribut nama, merek, warna, dan harga.
- Memiliki beberapa metode getter dan setter untuk mengakses dan mengubah nilai atribut. 
- Memiliki metode toString() untuk menampilkan informasi objek dalam format string.

2. AlatTulisBuilder:
- Kelas ini membantu membuat objek AlatTulis dengan menggunakan pola desain builder. 
- Memiliki metode nama(), merek(), warna(), dan harga() untuk mengatur nilai atribut objek AlatTulis. 
- Memiliki metode getResult() untuk mengambil objek AlatTulis yang telah dibuat.

3. AlatTulisDirector:
- Kelas ini memiliki metode untuk membuat objek AlatTulis dengan konfigurasi yang telah ditentukan. 
- Memiliki metode buildpensil(), buildpulpen(), dan buildsepidol() untuk menghasilkan objek AlatTulis dengan konfigurasi pensil, pulpen, dan spidol.


Analisa Main.java:
1. Membuat Alat Tulis Pertama dengan Setters:
- Membuat objek baru alattulis1 dari kelas AlatTulis. 
- Nilai atribut nama, merek, warna, dan harga diatur satu per satu menggunakan metode setter. 
- Informasi objek dicetak dengan toString(). 


2. Membuat Alat Tulis Kedua dengan AlatTulisBuilder:
- Membuat objek baru alattulis2 dari kelas AlatTulisBuilder. 
- Nilai atribut nama, warna, dan harga diatur secara berurutan menggunakan metode nama(), warna(), dan harga(). 
- Nilai atribut merek dibiarkan null. 
- Objek AlatTulis yang telah dibuat diperoleh dengan getResult(). 
- Informasi objek dicetak dengan toString().

3. Membuat Alat Tulis Ketiga dengan AlatTulisDirector:
- Membuat objek alatTulisDirector dari kelas AlatTulisDirector.
- Objek AlatTulis konfigurasi spidol diperoleh dengan alatTulisDirector.buildsepidol().
- Informasi objek dicetak.