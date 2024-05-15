Analisa Robot.java:
1. Robot:
- Kelas ini memiliki properti private seperti shield (perisai), sword (pedang), gun (senjata), dan brainchip (chip otak).
- Kelas ini memiliki method untuk mendapatkan (getter) dan merubah nilai (setter) dari properti-properti tersebut, serta method toString untuk menampilkan detail robot.

2. RobotBuilder:
- Kelas ini berfungi untuk membangun objek Robot dengan pola rancangan "builder".
- Memiliki method untuk mengatur properti robot seperti shield, gun, sword, dan brainchip secara berantai.
- Method getResult digunakan untuk mendapatkan objek Robot yang sudah selesai dibangun.

3. RobotDirector:
- Kelas ini berperan sebagai "director" dalam pola rancangan "builder". 
- Mengatur dan mengarahkan pembuatan Robot dengan menggunakan RobotBuilder. 
- RobotDirector memiliki method untuk membuat berbagai jenis Robot dengan spesifikasi yang telah ditentukan, contohnya seperti CasualRobot dan IntelligentRobot.  
- Selain itu, terdapat method RereRobot yang mungkin merupakan contoh pembuatan robot dengan konfigurasi custom.


Analisa Main.java:
1. Membangun Robot dengan Setter:
- Pertama, program membuat objek Robot robot1 secara langsung menggunakan constructor. 
- Kemudian, program menggunakan method setter untuk mengatur nilai properti shield, gun, sword, dan brainchip satu per satu. 
- Terakhir, program menampilkan detail robot1 menggunakan method toString. 

2. Membangun Robot dengan RobotBuilder:
- Program membuat objek Robot robot2 menggunakan kelas RobotBuilder. 
- RobotBuilder memiliki method berantai untuk mengatur properti robot, sehingga penulisan kode menjadi lebih ringkas dan mudah dibaca. 
- Pada pembuatan robot2, pedang (sword) diatur menjadi null. 
- Setelah semua properti diatur, method getResult dipanggil untuk mendapatkan objek Robot yang sudah selesai dibangun. 
- Detail robot2 kemudian dicetak.

3. Membangun Robot dengan RobotDirector:
- Program menggunakan method getInstance untuk membuat objek RobotDirector secara singleton (hanya dibuat satu kali). 
- Program memanggil method RereRobot dari RobotDirector untuk membuat objek Robot dengan konfigurasi tertentu (mungkin konfiguasi custom). 
- Detail robot yang dihasilkan (RereRobot) kemudian dicetak.